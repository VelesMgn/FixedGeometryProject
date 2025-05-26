package com.example;

import com.geometry.Circle;
import com.geometry.Rectangle;

public class ShapeComparator {
    public static boolean compareAreas(Circle c, Rectangle r) {
        return Math.abs(c.getArea() - r.getArea()) < 0.0001;
    }
}