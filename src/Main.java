public class Main {
    public  Autor createAutor(String firstName, String lastName) {
        Autor autor = new Autor();

        Autor.firstName = firstName;
        Autor.lastName = lastName;

        return autor;
    }

    public static Book createBook(String title, int year){
        Book book = new Book();

        Book.title = title;
        Book.year = year;

        return book;
    }

    public static void main(String[] args) {






    }
}