package com.brainacad.calc;

import com.brainacad.shapes.Triangle;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3,3, 3);
        System.out.println(triangle1.getArea());
    }
}
