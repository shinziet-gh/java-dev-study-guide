package utility;

public class TubeLight extends Light{
    private int tubeLength;
    private int tubeDiameter;
    private static String lightType = "Tube Light";
    private static final double COST_RATE = 0.10;

    public TubeLight(int noOfWatts, boolean indicator, String location, int tubeLength, int tubeDiameter) {
        super(noOfWatts, indicator, location); //Calling Light constructor in super class
        this.tubeLength = tubeLength;
        this.tubeDiameter = tubeDiameter;
    }

    public int getTubeLength() {
        return this.tubeLength;
    }

    public int getTubeDiameter() {
        return this.tubeDiameter;
    }

    @Override
    public double energyCost(int noOfHours) throws ZeroHoursException{
        if (noOfHours < 0) { 
            throw new ZeroHoursException();
        }
        return noOfHours * COST_RATE;
    }

    public void printInfo() {
        //Print TubeLight specific details
        System.out.println("Tube length (mm): " + getTubeLength());
        System.out.println("Tube diameter (mm): " + getTubeDiameter());

        //Print Light details
        System.out.println("Wattage: " + getNoOfWatts());
        System.out.println("Location: " + getLocation());
        System.out.println("Indicator: " +  (isOn() ? "On" : "Off"));
        System.out.println("Number of lights: " + getCount());
    }

    public static void printLightType() {
        //Parent behavior are hidden but not overriden.
        System.out.print(">> Static TubeLight.printLightType(): ");
        System.out.println(lightType);
    }
}
