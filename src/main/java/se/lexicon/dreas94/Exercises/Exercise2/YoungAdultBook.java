package se.lexicon.dreas94.Exercises.Exercise2;

public class YoungAdultBook extends Book implements Loanable
{
    public YoungAdultBook()
    {
        super();
        super.setCategory(Category.ADULT);
    }

    public YoungAdultBook(String title, String author, int years, int pages)
    {
        super(title, author, years, pages);
    }

    public void loan()
    {
        System.out.println("You have loaned a book for young adults named " + super.getTitle() + " made by " + super.getAuthor() + " year " + super.getYears() + ". It has " + super.getPages() + " pages.");
    }
}
