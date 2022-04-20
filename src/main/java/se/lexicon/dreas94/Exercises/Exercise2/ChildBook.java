package se.lexicon.dreas94.Exercises.Exercise2;

public class ChildBook extends Book implements Loanable
{
    public ChildBook()
    {
        super();
        super.setCategory(Category.CHILD);
    }

    public void loan()
    {
        System.out.println("You have loaned a book for children named " + super.getTitle() + " made by " + super.getAuthor() + " year " + super.getYears() + ". It has " + super.getPages() + " pages.");
    }
}
