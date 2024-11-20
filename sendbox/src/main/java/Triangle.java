public class Triangle {
    public static void main(String[] args) {
        printPerimeterTriangle(1,2,3);
        printSquareTriangle(4.0,5.0,6.0);
    }

    private static double printSquareTriangle(double a, double b, double c) {
        System.out.println("Площадь треугольника со сторонами " + a + " и " + b + " и " + c + " = " + squareAre(a,b,c));
        return a;
    }

    private static double squareAre(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    static void printPerimeterTriangle(double side1, double side2, double side3){
        System.out.println("Периметр треугольника по трём сторонам = " + perimeterArea(side1, side2, side3));
    }

    private static double perimeterArea(double a, double b, double c) {
        return a + b + c;
    }
}

