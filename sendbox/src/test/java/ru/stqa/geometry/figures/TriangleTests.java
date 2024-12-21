package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculateArea() {
        var a = new Triangle(3., 4., 5.);
        double result;
        result = a.area();
        Assertions.assertEquals(6., result);
    }

    @Test
    void canCalculatePerimeter() {
        var b = new Triangle(1, 1, 1);
        double result;
        result = b.perimeter();
        Assertions.assertEquals(3, result);
    }

    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(-1.,1.,1);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ок
        }
    }

    @Test
    void cannotCreateTriangleWithSideInequality() {
        try {
            new Triangle(1,1,3);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ок
        }
    }
}
