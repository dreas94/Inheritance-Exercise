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

        Book[] books = new Book[]{new ChildBook("Alice in Wonderland", "Random Person", 1231,12314), new YoungAdultBook("Twilight", "Doesnt Matter", 24235124,3452324), new ReferenceBook()};

        System.out.println("Here are all books which are a instance of Loanable");
        for(Book book : books)
        {
            if(book instanceof Loanable)
            {
                System.out.println(book);
            }
        }

        System.out.println("Here are all non loanable books");
        for(Book book : books)
        {
            if(book.getCategory() == Book.Category.NOT_LOANABLE)
            {
                System.out.println(book);
            }
        }

        System.out.println("Here are all children's books");
        for(Book book : books)
        {
            if(book.getCategory() == Book.Category.CHILD)
            {
                System.out.println(book);
            }
        }

        System.out.println("Here are all adult books");
        for(Book book : books)
        {
            if(book.getCategory() == Book.Category.ADULT)
            {
                System.out.println(book);
            }
        }
    }
}
