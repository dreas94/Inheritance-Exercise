package se.lexicon.dreas94.Exercises.Exercise1;

public abstract class Vehicle
{
    private int vehicleId;
    String registrationNumber;
    String brand;
    private static int sequencer = 0;

    Vehicle()
    {
        setVehicleId(sequencer++);
        setRegistrationNumber("");
        setBrand("");
    }

    Vehicle(String registrationNumber, String brand)
    {
        setRegistrationNumber(registrationNumber);
        setBrand(brand);
    }

    public int getVehicleId()
    {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId)
    {
        this.vehicleId = vehicleId;
    }

    public String getRegistrationNumber()
    {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber)
    {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    @Override
    public String toString()
    {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public abstract void drive();
}
