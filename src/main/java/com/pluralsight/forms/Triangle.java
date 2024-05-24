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
        //stuff to draw triangle
    }
}
