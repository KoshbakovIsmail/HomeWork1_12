public class Main {
    public static void main(String[] args) {
        Book book = new Book("Initial Java", 1999);

        System.out.println("book.getBookTitle() = " + book.getBookTitle());
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());

        book.setBookTitle("Java");
        book.setYearOfPublication(2000);

        System.out.println("book.getBookTitle() = " + book.getBookTitle());
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());

        Author author = new  Author("Лев","Толстой","Николаевич");

        System.out.println("author.getAuthorLastName() = " + author.getAuthorLastName());
        System.out.println("author.getAuthorFirstName() = " + author.getAuthorFirstName());
        System.out.println("author.getAuthorSurName() = " + author.getAuthorSurName());

        author.setAuthorLastName("Иванов");
        author.setAuthorFirstName("Иван");
        author.setAuthorSurName("Василивич");

        System.out.println("author.getAuthorLastName() = " + author.getAuthorLastName());
        System.out.println("author.getAuthorFirstName() = " + author.getAuthorFirstName());
        System.out.println("author.getAuthorSurName() = " + author.getAuthorSurName());

    }

}




