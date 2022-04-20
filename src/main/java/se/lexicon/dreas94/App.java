package se.lexicon.dreas94;

import se.lexicon.dreas94.Exercises.Exercise1.*;
import se.lexicon.dreas94.Exercises.Exercise2.*;


public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car("ABC123", "Volvo", 4, 6);
        Truck truck = new Truck("DEF456", "Toyota", 120, 5000);
        Motorcycle bike = new Motorcycle("GHI789", "Volkswagen", "One seater");
        car.drive();
        truck.drive();
        bike.drive();
    }
}
