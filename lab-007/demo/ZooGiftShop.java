package demo;

/* Example of Anonymous Class */

//Most often used as an event handler in a JavaFX application
//Useful for short implementation that will not be used anywhere else

public class ZooGiftShop {

    //Define abstract class
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

    public int admission(int basePrice) {
        //Instantiate a new SaleTodayOnly object
        SaleTodayOnly sale = new SaleTodayOnly() {
            int dollarsOff() { return 3; }
        };
        return basePrice - sale.dollarsOff();
    }
}
