package ru.stqa.geometry.figures;

import static java.lang.Math.sqrt;

//Класс треугольника содержит 3 поля
public record Triangle(double side1, double side2, double side3) {

    //Конструктор
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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
        double s = (this.side1 + this.side2 + this.side3) / 2;
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
}