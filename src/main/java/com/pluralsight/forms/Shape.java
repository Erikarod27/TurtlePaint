package com.pluralsight.forms;

import java.awt.Color;
import java.awt.Point;

public abstract class Shape {
    // Instance variables shared by child classes
    protected Turtle turtle;
    protected Point location;
    protected Color color;
    protected double border;

    // Shape constructor
    public Shape(Turtle turtle, Point location, Color color, double border) {
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.border = border;
    }

    // Getters and setters for instance variables
    public Turtle getTurtle() {
        return turtle;
    }
    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }
    public Point getLocation() {
        return location;
    }
    public void setLocation(Point location) {
        this.location = location;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public double getBorder() {
        return border;
    }
    public void setBorder(double border) {
        this.border = border;
    }

    // Abstract paint method
    public abstract void paint();
}
