public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой", "Николаевич");
        Book book = new Book("Java S", 1999, author);
        System.out.println("book.getBookTitle() = " + book.getBookTitle());
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());
        System.out.println("book.getAuthor() = " + book.getAuthor());
        System.out.println("book = " + book);
        book.setBookTitle("Java");
        book.setYearOfPublication(2000);
        author.setAuthorLastName("Л");
        author.setAuthorFirstName("Т");
        author.setAuthorSurName("Н");
        System.out.println("book = " + book);

    }

}




