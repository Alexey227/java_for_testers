public class Triangle {

    static void TriangleArea(double a, double b, double c) {
        var text = String.format("Площадь трегольника со сторонами %f и %f и %f = %f", a, b, c, triangleArea(a, b, c));
        System.out.println(text);
    }

    static double triangleArea(double a, double b, double c) {
        double s = a + b + c / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    static void TrianglePerimeter(double a, double b, double c) {
        var text = String.format("Периметер трегольника со сторонами %f и %f и %f = %f", a, b, c, trianglePerimeter(a, b, c));
        System.out.println(text);
    }

    static double trianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Triangle.TriangleArea(3., 4., 5.);
        Triangle.TrianglePerimeter(3., 4., 5.);
    }

}