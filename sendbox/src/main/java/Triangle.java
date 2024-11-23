public class Triangle {
    static double side1 = 3;
    static double side2 = 4;
    static double side3 = 5;

    public Triangle(double side1, double side2, double side3) {
        Triangle.side1 = side1;
        Triangle.side2 = side2;
        Triangle.side3 = side3;
    }

    public static double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static double getPerimeter() {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        System.out.println("Площадь треугольника = " + Triangle.getArea());
        System.out.println("Периметр треугольника по трём сторонам = " + Triangle.getPerimeter());
    }
}

