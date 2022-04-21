package se.lexicon.dreas94.Exercises.Exercise2;

public class ReferenceBook extends Book
{
    public ReferenceBook()
    {
        super();
        super.setCategory(Category.NOT_LOANABLE);
    }

    public ReferenceBook(String title, String author, int years, int pages)
    {
        super(title, author, years, pages);
    }
}
