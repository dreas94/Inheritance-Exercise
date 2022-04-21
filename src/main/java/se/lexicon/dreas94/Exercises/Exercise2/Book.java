package se.lexicon.dreas94.Exercises.Exercise2;

public class Book
{
    public enum Category
    {
        CHILD,
        ADULT,
        NOT_LOANABLE
    }
    private String title;
    private String author;
    private Category category;
    private int years;
    private int pages;

    public Book()
    {
        setPages(100);
    }

    public Book(String title, String author, int years, int pages)
    {
        setPages(pages);
        setTitle(title);
        setAuthor(author);
        setYears(years);
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public Category getCategory()
    {
        return category;
    }

    public void setCategory(Category category)
    {
        this.category = category;
    }

    public int getYears()
    {
        return years;
    }

    public void setYears(int years)
    {
        this.years = years;
    }

    public int getPages()
    {
        return pages;
    }

    public void setPages(int pages)
    {
        this.pages = pages;
    }

    @Override
    public String toString()
    {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category=" + category +
                ", years=" + years +
                ", pages=" + pages +
                '}';
    }
}
