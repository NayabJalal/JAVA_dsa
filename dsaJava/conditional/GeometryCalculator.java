package conditional;

public class GeometryCalculator {

    // ✅ AREA METHODS
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }

    public static double areaOfIsoscelesTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static double areaOfParallelogram(double base, double height) {
        return base * height;
    }

    public static double areaOfRhombus(double d1, double d2) {
        return 0.5 * d1 * d2;
    }

    public static double areaOfEquilateralTriangle(double side) {
        return (Math.sqrt(3) / 4) * side * side;
    }


    // ✅ PERIMETER METHODS
    public static double perimeterOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double perimeterOfEquilateralTriangle(double side) {
        return 3 * side;
    }

    public static double perimeterOfParallelogram(double base, double side) {
        return 2 * (base + side);
    }

    public static double perimeterOfRectangle(double length, double breadth) {
        return 2 * (length + breadth);
    }

    public static double perimeterOfSquare(double side) {
        return 4 * side;
    }

    public static double perimeterOfRhombus(double side) {
        return 4 * side;
    }


    // ✅ VOLUME METHODS
    public static double volumeOfCone(double radius, double height) {
        return (Math.PI * radius * radius * height) / 3;
    }

    public static double volumeOfPrism(double baseArea, double height) {
        return baseArea * height;
    }

    public static double volumeOfCylinder(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static double volumeOfSphere(double radius) {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public static double volumeOfPyramid(double baseArea, double height) {
        return (baseArea * height) / 3;
    }


    // ✅ SURFACE AREA METHODS
    public static double curvedSurfaceAreaOfCylinder(double radius, double height) {
        return 2 * Math.PI * radius * height;
    }

    public static double totalSurfaceAreaOfCube(double side) {
        return 6 * side * side;
    }


    // ✅ MAIN METHOD FOR TESTING
    public static void main(String[] args) {
        System.out.println("Area of Circle (r=5): " + areaOfCircle(5));
        System.out.println("Perimeter of Rectangle (l=4,b=6): " + perimeterOfRectangle(4,6));
        System.out.println("Volume of Sphere (r=3): " + volumeOfSphere(3));
        System.out.println("TSA of Cube (a=4): " + totalSurfaceAreaOfCube(4));
    }
}
