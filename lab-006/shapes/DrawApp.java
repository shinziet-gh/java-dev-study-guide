package shapes;

public class DrawApp {

    public static void main(String[] args) {
        //Declare IDrawable array holding Shape objects.
        IDrawable[] drawables = {
            new Square(45), 
            new Circle(8), 
            new Rectangle(12,12)
        };
        
        //Invoke Shape methods
        System.out.println(">> Draw shapes : ");
        for (IDrawable drawable : drawables) {
            drawable.draw();
        }

        System.out.println(">> Compute area of shapes : ");
        for (IDrawable drawable : drawables) {
            //Using the instanceof pattern match operator.
            if (drawable instanceof Shape shape) {
                System.out.print(shape.area()); //Treat drawable as Shape to call area()
                System.out.println("");
            }
        }
    }
}
