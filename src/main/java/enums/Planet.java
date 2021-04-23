package enums;

public enum Planet {
    MERCURY(0.39), VENUS(), EARTH;
    private double distanceFromSunAU = 1.0;
    private Planet(double distance){
        this.distanceFromSunAU = distance;
    }
    private Planet(){
        distanceFromSunAU = 5.0;
    }
    public double getDistance(){
        return this.distanceFromSunAU;
    }

}
