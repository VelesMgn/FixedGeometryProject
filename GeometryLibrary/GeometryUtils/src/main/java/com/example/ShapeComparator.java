package com.example;

public class ShapeComparator {
    public static boolean compareAreas(double c, double r) {
        return Math.abs(c - r) < 0.0001;
    }
}