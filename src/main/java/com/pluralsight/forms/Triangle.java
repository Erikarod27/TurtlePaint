package com.pluralsight.forms;

import java.awt.*;

public class Triangle extends Shape {
    public Triangle(Turtle turtle, Point location, String color, double border) {
        super(turtle, location, color, border);
    }

    @Override
    public void paint() {
        //stuff to draw triangle
    }
}
