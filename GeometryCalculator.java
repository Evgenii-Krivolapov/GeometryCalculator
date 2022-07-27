package practice;

public class GeometryCalculator {

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getCircleSquare(double radius) {
        double area = Math.PI * (radius * radius);
        System.out.println("Площадь круга равна: " + area);
        if (radius < -1){
            System.out.println("Such circle not exists");
            return -1;
        }
        return area;
    }

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getSphereVolume(double radius) {
        if (radius < 0) {
            return -1;
        }
        else return Math.PI * 4 * radius * radius * radius / 3;
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        } else return !(a + b <= c) && !(a + c <= b) && !(b + c <= a);
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (isTrianglePossible(a, b, c)) {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else return -1.0;
    }
}