package ru.stqa.geometry;

import ru.stqa.geometry.figures.Triangle;
import static ru.stqa.geometry.figures.Triangle.printTrianglePerimeter;

public class Geometry {
    public static void main(String[] args) {
        //Значение полей площади
        Triangle.printTriangleArea(3.,4.,5.);

        //Значение полей периметра
        printTrianglePerimeter(1,1,1);
    }
}
