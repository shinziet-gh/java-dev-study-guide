package utility;

public class UtilityApp {

    public static void main(String[] args) throws InvalidHoursException{
        TubeLight loftLight = new TubeLight(18, true, "Loft", 590, 26);
        loftLight.printInfo();

        //Subtyping between Light and TubeLight
        Light basementLight = new TubeLight(26, false, "Basement", 1200, 26);
        Light diningLight = new Light(20, true, "Dining room");
        
        //Invoke methods from the supertype Light
        basementLight.switchOn();
        System.out.println("Basement light: " + (basementLight.isOn() ? "On" : "Off"));
        
        //Invoke subtype specific behaviour
        // int length = basementLight.getTubeLength();

        //Invoke overridden instance method        
        double cost1 = loftLight.energyCost(50);
        System.out.println("Energy cost for Loft Light : " + cost1);

        double cost2 = basementLight.energyCost(50);
        System.out.println("Energy cost for Basement Light : " + cost2);

        double cost3 = diningLight.energyCost(50);
        System.out.println("Energy cost for Dining Light : " + cost3);

        //Invoke hidden static method
        loftLight.printLightType();
        basementLight.printLightType();
        diningLight.printLightType();
    }
}
