package se.lexicon.dreas94.Exercises.Exercise1;

public class Car extends Vehicle
{
    private int numberOfDoors;
    private int numberOfPassengers;

    public Car()
    {
        super();
        setNumberOfDoors(0);
        setNumberOfPassengers(0);
    }

    public Car(String registrationNumber, String brand, int numberOfDoors, int numberOfPassengers)
    {
        super(registrationNumber, brand);
        setNumberOfDoors(numberOfDoors);
        setNumberOfPassengers(numberOfPassengers);
    }

    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors)
    {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfPassengers()
    {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers)
    {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", numberOfPassengers=" + numberOfPassengers +
                '}';
    }

    public void drive()
    {
        System.out.println("Car is driving, it has " + numberOfDoors + " doors and can handle " + numberOfPassengers + " passengers.");
    }
}
