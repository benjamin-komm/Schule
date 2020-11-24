public class Book extends Article{

    public static float vat = 0.07f;

    private String author;
    private String title;
    private int year;

    public Book(int articleNumber, float price, String author, String title, int year) {
        super(articleNumber, price);
        setAuthor(author);
        setTitle(title);
        setYear(year);
    }

    @Override
    public float getPrice(){
        return super.getPrice() + (super.getPrice() * vat);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
