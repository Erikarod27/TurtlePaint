package com.pluralsight.forms;

import java.awt.*;

public class Circle extends Shape {
    private double radius;

    public Circle(Turtle turtle, Point location, Color color, double border, double radius) {
        super(turtle, location, color, border);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void paint() {
        // Starting position
        turtle.penUp();
        turtle.goTo(location.x, location.y);
        turtle.penDown();

        // Color and pen width
        turtle.setColor(color);
        turtle.setPenWidth(border);

        double circumference = 2 * Math.PI * radius / 360;

        // Draw the circle
        for (int i = 0; i < 360; i++) {
            turtle.forward(circumference);
            turtle.turnRight(1);
        }
    }
}
