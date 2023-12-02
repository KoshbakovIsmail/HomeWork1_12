public class Book {
    private String bookTitle;
    private String bookAuthor;
    private int yearOfPublication;
    public Book(String bookTitle, String bookAuthor, int yearOfPublication) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookTitle() {

        return bookTitle;
    }

    public String getBookAuthor() {

        return bookAuthor;

    }

    public int getYearOfPublication() {

        return yearOfPublication;
    }

    public void setBookTitle(String bookTitle) {

        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor =bookAuthor;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }




}
