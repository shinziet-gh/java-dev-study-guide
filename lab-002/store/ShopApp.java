package store;

public class ShopApp {

    public static void main(String[] args) {
        //Declare two variables to reference two new Clothing objects
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M", Clothing.CONDITION.DAMAGED);
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S", Clothing.CONDITION.USED);

        //Set tax at 20% rate
        double taxRate = 0.2;

        //Create customer
        Customer cust = new Customer("Jayden");

        //Store each item and quantity of this customer
        cust.addItem(item1, 1);
        cust.addItem(item2, 2);

        //Get total clothing cost
        double total = cust.calculateSumPrice(taxRate);

        //Print total amount value
        System.out.println("Amount due for " + cust.name + ": $" + String.valueOf(total));

        //Print details of these clothing items
        System.out.println(item1);
        System.out.println(item2);

    }
}
