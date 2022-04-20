package se.lexicon.dreas94.Exercises.Exercise1;

public class Motorcycle extends Vehicle
{
    String motorCycleType;

    public Motorcycle()
    {
        super();
        setMotorCycleType("");
    }

    public Motorcycle(String registrationNumber, String brand, String motorCycleType)
    {
        super(registrationNumber, brand);
        setMotorCycleType(motorCycleType);
    }

    public String getMotorCycleType()
    {
        return motorCycleType;
    }

    public void setMotorCycleType(String motorCycleType)
    {
        this.motorCycleType = motorCycleType;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Motorcycle{" +
                "motorCycleType='" + motorCycleType + '\'' +
                '}';
    }

    public void drive()
    {
        System.out.println("Motorcycle is driving, is a " + motorCycleType);
    }
}
