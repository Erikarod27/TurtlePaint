package com.pluralsight.forms;

import java.awt.*;

//Abstract shape class
public class Square extends Shape {
    public Square (Turtle turtle, Point location, String color, double border) {
        super(turtle, location, color, border);
    }

    @Override
    public void paint() {
        //stuff to draw square
        getTurtle().setColor(getColor());
        getTurtle().setPenWidth(getBorder());
        getTurtle().penUp();
        getTurtle().goTo(getLocation().x, getLocation().y);

        getTurtle().forward();
        getTurtle().turnRight(90);
        getTurtle().forward();
        getTurtle().turnRight(90);
        getTurtle().forward();
        getTurtle().turnRight(90);
        getTurtle().forward();
    }

}
