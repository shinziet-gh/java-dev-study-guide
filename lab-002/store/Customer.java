package store;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    String name;
    Map<Clothing, Integer> items = new HashMap<>();

    public Customer(String name) {
        this.name = name;
    }

    //Add item to cart
    public void addItem(Clothing item, int quantity) {
        items.put(item, quantity);
    }

    //Does total price calculation
    public double calculateSumPrice(double taxRate) {
        double sumPrice = 0;

        //Loop through items in collection
        for (Map.Entry<Clothing,Integer> item : this.items.entrySet()) {
            Clothing clothing = item.getKey();
            int quantity = item.getValue();
            double discount = clothing.price * clothing.discount; //apply discount for damaged or used item
            sumPrice += ((clothing.price - discount) * quantity); //calculate price after discount
        }

        return sumPrice * (1 + taxRate); //apply tax to total price
    }

    @Override
    public String toString() {
        return this.name;
    }
}
