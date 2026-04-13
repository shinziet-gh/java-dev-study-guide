package shapes;

abstract class Shape implements IDrawable {
    abstract public int area();
}

interface IDrawable {
    void draw();
}