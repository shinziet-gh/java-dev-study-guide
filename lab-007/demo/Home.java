package demo;

/* Example of Inner Class */

public class Home {
    private String greeting = "Welcome";

    //Inner Room class
    protected class Room {
        public int repeat = 3;
        public void enter() {
            //Access private variable greeting from outer Home class
            for (int i = 0; i < repeat; i++) greet(greeting);
        }

        private void greet(String message) {
            System.out.println(message);
        }
    }

    public void enterRoom() {
        Room room = new Room();
        room.enter(); //Access enter() in the Room class
    }

    public static void main(String[] args) {
        Home home = new Home();
        home.enterRoom();

        //Initiate instance of Room class
        Room room = home.new Room();
        room.enter();
    }
}
