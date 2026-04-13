package shapes;

public class Rectangle extends Shape {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    
    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }

    @Override
    public int area() {
        System.out.print("Computing area of a Rectangle : ");
        return width * length;
    }

}
