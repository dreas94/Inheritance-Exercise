package se.lexicon.dreas94.Exercises.Exercise1;

public class Truck extends Vehicle
{
    private int maxSpeed;
    private int maxWeight;

    public Truck()
    {
        super();
        setMaxSpeed(0);
        setMaxWeight(0);
    }

    public Truck(String registrationNumber, String brand, int maxSpeed, int maxWeight)
    {
        super(registrationNumber, brand);
        setMaxSpeed(maxSpeed);
        setMaxWeight(maxWeight);
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
        System.out.println("Car is driving, it has " + maxSpeed + " Max Speed and can handle " + maxWeight + "kg.");
    }
}
