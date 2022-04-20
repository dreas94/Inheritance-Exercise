package se.lexicon.dreas94.Exercises.Exercise1;

public class Truck extends Vehicle
{
    private int maxSpeed;
    private int maxWeight;

    Truck()
    {
        super();
        setMaxSpeed(0);
        setMaxWeight(0);
    }

    Truck(String registrationNumber, String brand, int numberOfDoors, int numberOfPassengers)
    {
        super(registrationNumber, brand);
        setMaxSpeed(numberOfDoors);
        setMaxWeight(numberOfPassengers);
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxWeight()
    {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight)
    {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return super.toString() + "Truck{" +
                "maxSpeed=" + maxSpeed +
                ", maxWeight=" + maxWeight +
                '}';
    }

    public void drive()
    {
        System.out.println("Car is driving, it has " + maxSpeed + " Max Speed and can handle" + maxWeight + "kg.");
    }
}
