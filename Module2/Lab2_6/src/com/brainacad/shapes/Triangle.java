package com.brainacad.shapes;

import java.lang.Math;
/**
 * Create project MyCalc.
 * Create class Main with main() method in package com.brainacad.calc.
 * Create class Triangle in package com.brainacad.shapes with three double data fields
 * named “a”, “b”, and “c” with default values 1.0 to denote three sides of the triangle.
 * Add constructor with (a,b,c) parameters and creates a triangle with specified a, b, and c values.
 * Add method named getArea() that returns the area if this triangle using Heron formula.
 * Use static import from Math class. Create instance of Triangle in Main class and test getArea() method.
 */
public class Triangle {
    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = a;
        this.c = a;
    }

    public double getArea() {
        double area;
        double s = (a + b + c) / 2;
        area = Math.sqrt((s * (s - a) * (s - b) * (s - c)));
        return area;
    }

}
