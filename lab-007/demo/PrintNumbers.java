package demo;

/* Example of Local Class */

public class PrintNumbers {
    private int length = 5;

    public void calculate() {
        final int width = 20;

        class Calculator {
            public void multiply() {
                //Refers to instance variable and a final local variable
                //Values of these variables cannot change after the copy are made
                //Otherwise will cause compilation issue.
                System.out.println(length * width);
            }
        }

        var calculator = new Calculator();
        calculator.multiply();
    }

    public static void main(String[] args) {
        var printer = new PrintNumbers();
        printer.calculate();
    }
}
