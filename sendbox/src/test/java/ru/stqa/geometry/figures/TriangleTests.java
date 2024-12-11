package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculateArea() {
        var a = new Triangle(3.,4.,5.);
        double result;
        result = a.Area();
        Assertions.assertEquals(6.,result);
    }

    @Test
    void canCalculatePerimeter() {
        var b = new Triangle(1,1,1);
        double result;
        result = b.Perimeter();
        Assertions.assertEquals(3,result);
    }
}
