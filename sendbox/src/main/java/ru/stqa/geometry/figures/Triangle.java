package ru.stqa.geometry.figures;

import java.util.Objects;

import static java.lang.Math.sqrt;

//Класс треугольника содержит 3 поля
public record Triangle(double side1, double side2, double side3) {

    //Конструктор
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            throw new IllegalArgumentException("Triangle side should be non-negative");
        }
        if ( side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1 ) {
            throw new IllegalArgumentException("Triangle side inequality negative");
        }
    }

    public static void printTriangleArea(double a, double b, double c) {
        var text = String.format("Площадь треугольника со сторонами %f и %f и %f = %f", a, b, c, triangleArea(a, b, c));
        System.out.println(text);
    }

    private static double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }

    //метод вычисления площади
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }

    public static void printTrianglePerimeter(double a, double b, double c) {
        var text = String.format("Периметр треугольника со сторонами %f и %f и %f = %f", a, b, c, trianglePerimeter(a, b, c));
        System.out.println(text);
    }

    //метод вычисления периметра
    private static double trianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public double perimeter() {
        return (this.side1 + this.side2 + this.side3);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(side1, this.side1) == 0 && Double.compare(side2, this.side2) == 0 && Double.compare(side3, this.side3) == 0)
               || (Double.compare(side1, this.side2) == 0 && Double.compare(side2, this.side3) == 0 && Double.compare(side3, this.side2) == 0) ;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}