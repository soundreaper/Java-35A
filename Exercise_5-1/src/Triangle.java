public class Triangle {

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide(double side1, double side2, double side3) {

        if (side1 > 0.0 && side2 > 0.0 && side3 > 0.0) {
            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                this.side1 = side1;
                this.side2 = side2;
                this.side3 = side3;
            }
        }
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getTrianglePerimeter(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }

    public double getTriangleArea(double side1, double side2, double side3) {
        double halfPerimeter = getTrianglePerimeter(side1, side2, side3) / 2.0;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
        return area;
    }

    public static void main( String[] args ) {
        Triangle triangle1 = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Triangle 1 Perimeter: " + triangle1.getTrianglePerimeter(triangle1.side1, triangle1.side2, triangle1.side3));
        System.out.println("Triangle 1 Area: " + triangle1.getTriangleArea(triangle1.side1, triangle1.side2, triangle1.side3));

        Triangle triangle2 = new Triangle(16.2, 32.7, 44.8);
        System.out.println("\nTriangle 2 Perimeter: " + triangle2.getTrianglePerimeter(triangle2.side1, triangle2.side2, triangle2.side3));
        System.out.println("Triangle 2 Area: " + triangle2.getTriangleArea(triangle2.side1, triangle2.side2, triangle2.side3));
    }

}

// Output:
/*
    Triangle 1 Perimeter: 12.0
    Triangle 1 Area: 6.0

    Triangle 2 Perimeter: 93.7
    Triangle 2 Area: 204.0916268340034

 */