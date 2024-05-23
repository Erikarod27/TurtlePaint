package com.pluralsight;

import com.pluralsight.forms.Square;
import com.pluralsight.forms.Turtle;
import com.pluralsight.forms.World;

import java.awt.*;
import java.util.Scanner;

public class MainDisplay {

    Scanner scanner = new Scanner(System.in);
    public MainDisplay(){

    }

        public void start() {
            System.out.println("Enter canvas width: ");
            int canvasWidth = scanner.nextInt();
            System.out.println("Enter canvas height: ");
            int canvasHeight = scanner.nextInt();

            World world = new World(canvasWidth, canvasHeight);
            Turtle turtle = new Turtle(World world);


            while (true) {
                System.out.println("Welcome to Home Screen");
                System.out.println("1. Add Shape");
                System.out.println("2. Save Image");
                System.out.println("0. Exit");
                System.out.print("Please select an option: ");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        //call shape method
                        addShape();
                        break;
                    case 2:
                        //save image method
//                        World.saveAs();

                        break;
                    case 0:
                        System.out.println("Goodbye!");
                        System.exit(0);
                }
            }
        }

        private void addShape() {
            System.out.println("Enter border width: ");
            double borderWidth = scanner.nextDouble();
            System.out.println("Enter border color: ");
            String borderColor = scanner.nextLine().toUpperCase();
            System.out.println("Enter x coordinate: ");
            int x = scanner.nextInt();
            System.out.println("Enter y coordinate: ");
            int y = scanner.nextInt();
            Point location = new Point(x, y);

            System.out.println("Choose a shape");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
            System.out.println("Please select an option: ");
            int option = scanner.nextInt();
            switch(option) {
                case 1:
                    //circle class thingy
                    break;
                case 2:
                    //Triangle
                    break;
                case 3:
                    //Square
                    Shape = new Square(turtle, location, borderColor, borderWidth);
                    break;
                default:
                    System.out.println("Uh oh you made the turtle mad >:(");
                    break;
            }
        }


}
