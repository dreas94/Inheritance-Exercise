package se.lexicon.dreas94.Exercises.Exercise1;

public class Motorcycle extends Vehicle
{
    String motorCycleType;

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
