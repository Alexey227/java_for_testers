package ru.stqa.geometry.figures;

//Класс треугольника содержит 3 поля
public record Triangle(double a, double b, double c) {

        //консутруктор класса площади, где инициализируем поля
        public static void printTriangleArea(double a, double b, double c) {
                var text = String.format("Площадь треугольника со сторонами %f и %f и %f = %f", a, b, c, triangleArea(a, b, c));
                System.out.println(text);
        }

        //неполучается сделать метод вычесления площади не статичным
        private static double triangleArea(double a, double b, double c) {
                double s = (a + b + c) / 2;
                return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        //консутруктор класса периметра, где инициализируем поля
        public static void printTrianglePerimeter(double a, double b, double c) {
                var text = String.format("Периметр треугольника со сторонами %f и %f и %f = %f", a, b, c, trianglePerimeter(a, b, c));
                System.out.println(text);
        }

        //неполучается сделать метод вычесления периметра не статичным
        private static double trianglePerimeter(double a, double b, double c) {
                return a + b + c;
        }
}