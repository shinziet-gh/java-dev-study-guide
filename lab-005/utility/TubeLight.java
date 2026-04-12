package utility;

public class TubeLight extends Light{
    private int tubeLength;
    private int tubeDiameter;

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
}
