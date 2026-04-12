package utility;

public class Light {
    protected int noOfWatts;
    private boolean indicator;
    protected String location;
    protected String lightType = "Generic Light";
    protected static final double COST_RATE = 0.2;

    private static int counter; //counts how many Lights object are created

    public Light(int noOfWatts, boolean indicator, String location) {
        this.noOfWatts = noOfWatts;
        this.indicator = indicator;
        this.location = location;
        this.counter += 1;
    }

    public void switchOn() {
        this.indicator = true;
    }

    public void switchOff() {
        this.indicator = false;
    }

    public boolean isOn() {
        return this.indicator;
    }

    public String getLocation() {
        return this.location;
    }

    public int getNoOfWatts() {
        return this.noOfWatts;
    }

    public int getCount() {
        return this.counter;
    }

    public double energyCost(int noOfHours) throws InvalidHoursException{
        if (noOfHours < 0) { 
            throw new NegativeHoursException();
        }
        return noOfHours * COST_RATE;
    }

    public static void printLightType() {
        System.out.print(">> Static Light.printLightType(): ");
        System.out.println("Generic Light");
    }
}
