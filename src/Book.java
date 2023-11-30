public class Book {
    private String bookTitle;
    private int yearOfPublication;

    public Book(String bookTitle, int yearOfPublication) {
        this.bookTitle = bookTitle;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
