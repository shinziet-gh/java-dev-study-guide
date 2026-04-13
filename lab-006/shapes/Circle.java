package shapes;

public class Circle extends Shape {
    public static final double PI_MATH = 3.14;
    private double radius;

    public Circle(double radius) { this.radius = radius; }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }

    @Override
    public int area() {
        System.out.print("Computing area of a Circle : ");
        return (int) Math.round(PI_MATH * radius * radius);
    }
}
