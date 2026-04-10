package store;

import java.util.*;

public class ShopApp {

    //Set tax to 20% rate
    static double taxRate = 0.2;

    public static void main(String[] args) {
        //Declare variables to reference new Clothing objects
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M", Clothing.CONDITION.DAMAGED);
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S", Clothing.CONDITION.USED);
        Clothing item3 = new Clothing("Green Scarf", 5.0, "S", Clothing.CONDITION.NEW);

        //A list of items
        List<Clothing> items = new ArrayList<>();

        items.add(item1);
        items.add(item2);
        items.add(item3);
        Collections.sort(items); //Sort clothing items

        //Print details of these clothing items in ascending order
        for (Clothing item : items) {
            System.out.println(item);
        }
    }
}
