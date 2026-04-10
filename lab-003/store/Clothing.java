package store;

public class Clothing implements Comparable<Clothing>{
    String description;
    double price;
    String size;
    double discount;

    //Enum constant representing clothing condition
    public enum CONDITION {
        DAMAGED, USED, NEW;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    public Clothing(String description, double price, String size, CONDITION condition) {
        this.description = description;
        this.price = price;
        this.size = size.isEmpty() ? "M" : size; //example of ternary operation
        
        //Use switch statement to set discount rate based on condition
        switch (condition) {
          case CONDITION.DAMAGED -> this.discount = 0.1;
          case CONDITION.USED -> this.discount = 0.2;
          default -> this.discount = 0.0;
        }
    }

    @Override
    public String toString() {
        return description + " " + String.valueOf(price) + " " + size;
    }

    //Sort objects by their descriptions using Comparable Interface
    @Override
    public int compareTo(Clothing o) {
        return this.description.compareTo(o.description);
    }
}
