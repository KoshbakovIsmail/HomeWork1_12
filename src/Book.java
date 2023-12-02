public class Book {
    private String bookTitle;
    private int yearOfPublication;
    private Author author;

    public Book(String bookTitle, int yearOfPublication, Author author) {
        this.bookTitle = bookTitle;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getBookTitle() {

        return bookTitle;
    }

    public Author getAuthor() {

        return author;

    }

    public int getYearOfPublication() {

        return yearOfPublication;
    }

    public void setBookTitle(String bookTitle) {

        this.bookTitle = bookTitle;
    }

    public void setAuthor(Author author) {

        this.author = author;
    }

    public void setYearOfPublication(int yearOfPublication) {

        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {

        return " Название книги-" + bookTitle + " год издание-" + yearOfPublication + " Автор-" + author;
    }

}
