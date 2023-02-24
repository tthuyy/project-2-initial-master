package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */

public class Project2 {
    public static void main(String[] args) {

        ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.forEach(System.out::println);

    }
}
