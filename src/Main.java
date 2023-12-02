public class Main {
    public static void main(String[] args) {
        Book book = new Book("JavaS", "Л.Тостой.Николаевич", 1999);
        Author author = new  Author("Лев","Толстой","Николаевич");
        System.out.println("book.getBookTitle() = " + book.getBookTitle());
        System.out.println("book.getBookAuthor() = " + book.getBookAuthor());
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());
        System.out.println("author.getAuthorLastName() = " + author.getAuthorLastName());
        System.out.println("author.getAuthorFirstName() = " + author.getAuthorFirstName());
        System.out.println("author.getAuthorSurName() = " + author.getAuthorSurName());

        book.setBookTitle("Java");
        book.setBookAuthor("Л.Толстой.Н");
        book.setYearOfPublication(2000);

        author.setAuthorLastName("Иванов");
        author.setAuthorFirstName("Иван");
        author.setAuthorSurName("Василивич");

        System.out.println("book.getBookTitle() = " + book.getBookTitle());
        System.out.println("book.getBookAuthor() = " + book.getBookAuthor());
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());

        System.out.println("author.getAuthorLastName() = " + author.getAuthorLastName());
        System.out.println("author.getAuthorFirstName() = " + author.getAuthorFirstName());
        System.out.println("author.getAuthorSurName() = " + author.getAuthorSurName());

    }

}




