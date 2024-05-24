package com.pluralsight.forms;

import java.awt.*;

public class Triangle extends Shape {
    private double baseLength;
    public Triangle(Turtle turtle, Point location, Color color, double border, double baseLength) {
        super(turtle, location, color, border);
        this.baseLength = baseLength;
    }

    public double getBaseLength() {
        return baseLength;
    }
    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
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

        // Draw the triangle
        for (int i = 0; i < 3; i++) {
            turtle.forward(baseLength);
            turtle.turnLeft(120);
        }
    }
}
