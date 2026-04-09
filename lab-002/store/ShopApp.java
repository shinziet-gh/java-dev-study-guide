package store;

import java.util.*;

public class ShopApp {

    //Does total price calculation
    public static double calculateSumPrice(Map<Clothing, Integer> items, double taxRate) {
        double sumPrice = 0;

        //Loop through items in collection
        for (Map.Entry<Clothing,Integer> item : items.entrySet()) {
            Clothing clothing = item.getKey();
            int quantity = item.getValue();
            double discount = clothing.price * clothing.discount; //apply discount for damaged or used item
            sumPrice += ((clothing.price - discount) * quantity); //calculate price after discount
        }

        return sumPrice * (1 + taxRate); //apply tax to total price
    }

    public static void main(String[] args) {
        //Declare two variables to reference two new Clothing objects
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M", Clothing.CONDITION.DAMAGED);
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S", Clothing.CONDITION.USED);

        //Store each item and quantity to the collection
        Map<Clothing, Integer> items = new HashMap<>();
        items.put(item1, 1);
        items.put(item2, 2);

        //Print details of these clothing items
        System.out.println(item1);
        System.out.println(item2);

        //Set tax at 20% rate
        double taxRate = 0.2;
        double total = calculateSumPrice(items, taxRate);

        //Print total amount value
        System.out.println(total);
    }
}
