package demo;

/* Example of Static Nested Class */

public class Park {
    static class Ride {
        private int price = 6;
    }

    public static void main(String[] args) {
        //Ride class can be directly instantiated 
        Ride ride = new Ride();
        System.out.println(ride.price);
    }
}
