package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square.");;
    }

    @Override
    public int area() {
        System.out.print("Computing area of a Square : ");
        return getLength() * getWidth();
    }
}
