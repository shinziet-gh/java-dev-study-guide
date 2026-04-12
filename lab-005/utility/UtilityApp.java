package utility;


public class UtilityApp {

    public static void main(String[] args) {
        TubeLight loftLight = new TubeLight(18, true, "Loft", 590, 26);
        loftLight.printInfo();

        //Subtyping between Light and TubeLight
        Light basementLight = new TubeLight(26, false, "Basement", 1200, 26);
        
        //Invoke methods from the supertype Light
        basementLight.switchOn();
        System.out.println("Basement light: " + (basementLight.isOn() ? "On" : "Off"));
        
        //Invoke subtype specific behaviour
        try {
            int length = basementLight.getTubeLength();
        } catch (Exception e) {
            System.out.println("Light class does not have a method called getTubeLength()");
        }
    }
}
