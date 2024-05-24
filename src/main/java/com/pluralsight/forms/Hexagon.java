package com.pluralsight.forms;

import java.awt.*;

public class Hexagon extends Shape {
    private double sideLength;

    public Hexagon(Turtle turtle, Point location, Color color, double border, double sideLength) {
        super(turtle, location, color, border);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
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

        // Draw the hexagon
        for (int i = 0; i < 6; i++) {
            turtle.forward(sideLength);
            turtle.turnRight(60);
        }
    }
}
