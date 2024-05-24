package com.pluralsight;

import com.pluralsight.forms.*;

import java.awt.Color;
import java.awt.Point;
import java.util.Scanner;

public class MainDisplay {
    private Turtle turtle;
    private World world;
    private Scanner scanner;

    //Main display method that creates new scanner
    public MainDisplay() {
        scanner = new Scanner(System.in);
    }

    //Start method for home screen
    public void start() {
        // Prompt user for canvas size before loop begins
        System.out.print("Enter canvas width: ");
        int canvasWidth = scanner.nextInt();
        System.out.print("Enter canvas height: ");
        int canvasHeight = scanner.nextInt();

        // Initialize turtle and canvas outside of loop so there's only one
        world = new World(canvasWidth, canvasHeight);
        turtle = new Turtle(world);

        //While loop to keep add shape or save image until exited
        while (true) {
            // Display menu
            System.out.println("Welcome to Home Screen");
            System.out.println("1. Add Shape");
            System.out.println("2. Save Image");
            System.out.println("0. Exit");
            System.out.print("Please select an option: ");
            int option = scanner.nextInt();

            //Switch case depending on user option
            switch (option) {
                //Add shape method
                case 1:
                    addShape();
                    break;
                //Save image method
                case 2:
                    saveImage();
                    break;
                //Exit program
                case 0:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                //Default prompt for invalid input
                default:
                    System.out.println("Uh oh you made the turtle mad >:(");
                    break;
            }
        }
    }

    private void addShape() {
        System.out.println("Choose a shape");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.println("4. Hexagon");
        System.out.print("Please select an option: ");
        int option = scanner.nextInt();

        System.out.print("Enter border width: ");
        double borderWidth = scanner.nextDouble();

        System.out.print("Enter border color (blue, red, black, magenta, cyan): ");
        scanner.nextLine(); // Consume newline left-over
        String colorName = scanner.nextLine().toUpperCase();
        Color borderColor = getColorFromString(colorName);

        System.out.print("Enter x coordinate: ");
        int x = scanner.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = scanner.nextInt();
        Point location = new Point(x, y);

        Shape shape = null;

        switch (option) {
            case 1:
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Be patient with the turtle hes slow!");
                shape = new Circle(turtle, location, borderColor, borderWidth, radius);
                break;
            case 2:
                System.out.print("Enter base length of the triangle: ");
                double baseLength = scanner.nextDouble();
                shape = new Triangle(turtle, location, borderColor, borderWidth, baseLength);
                break;
            case 3:
                System.out.print("Enter side length of the square: ");
                double sideLength = scanner.nextDouble();
                shape = new Square(turtle, location, borderColor, borderWidth, sideLength);
                break;
            case 4:
                System.out.println("Enter side length of the hexagon: ");
                sideLength = scanner.nextDouble();
                shape = new Hexagon(turtle, location, borderColor, borderWidth, sideLength);
                break;
            default:
                System.out.println("Uh oh you made the turtle mad >:(");
                return;
        }

        // Paint the shape
        if (shape != null) {
            shape.paint();
        }
    }

    private void saveImage() {
        System.out.println("Enter the filename to save the image (ex: image.png): ");
        String filename = scanner.next();

        try {
            world.saveAs(filename);
            System.out.println("Image saved successfully as " + filename);
        } catch (IllegalArgumentException e) {
            System.err.println("Error saving file: " + e.getMessage());
        }
    }

    private Color getColorFromString(String colorName) {
        try {
            return (Color) Color.class.getField(colorName).get(null);
        } catch (Exception e) {
            System.out.println("Invalid. Defaulting to black.");
            return Color.BLACK;
        }
    }
}
