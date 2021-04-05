package exercise9Chapter2;

public class Car {
    private double fuelConsumption;
    private double Tank=50;//бак
    private double fuelNow;
    private double fuel=6;
    private double Distance=0;
    private double deltaDistance=0;
    double j;

    public double getFuel() {
        return fuel;
    }


    public double move()
    {
        Distance+=deltaDistance;
        return Distance;
    }
    public double fillTheTank()
    {
        fuelNow+=fuel;
        if (fuelNow>getTank())
        {
            fuelNow=getTank();
        }
            return fuelNow;

    }
    public double calculateDistance()
    {
        return Distance;
    }

    public double getFuelConsumption() {

        return fuelConsumption;
    }

    public double getFuelNow() {
        fuelNow=0;
        return fuelNow;
    }
    public double getTank() {
        return Tank;
    }

    public Car(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption,double deltaDistance) {
        this.fuelConsumption = fuelConsumption;

    }
    public double  useUpFuel()
    {
        j=(getFuelConsumption()/100)*getDistance();




        return j;
    }

    public double getDistance() {
        return Distance;
    }

    public double getDeltaDistance() {
        return deltaDistance;
    }

    public void setDeltaDistance(double deltaDistance) {
        this.deltaDistance = deltaDistance;
    }
    public double calculateTheRemainder()
    {
        double i=fuelNow-useUpFuel();
        if (i<0) {
            i=0;
        }


        return i;
    }

    @Override
    public String toString() {
        return "Автомобиль с объемом бака{" +
                "" + Tank +
                '}';
    }

    public boolean is()
    {
        if (fillTheTank()>useUpFuel())
        {
            return true;
        }
        return false;
    }

}
