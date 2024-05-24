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
        //stuff to draw circle
    }
}
