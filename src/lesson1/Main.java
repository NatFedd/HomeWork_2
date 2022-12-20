package lesson1;

public class Main {

    public static void main(String[] args) {

        Book woeFromWit = new Book("woeFromWit", "Griboyedov", 1984);

        System.out.println("book.title = " + Book.Title.());
        System.out.println("Author.surname = " + Author.getSurname());
        System.out.println("Author.yearPublication = " + Author.getYearPublication());
        Author.yearPublication = "1980";
        System.out.println("Author.yearPublication = " + Author.getYearPublication());

        Book demons = new Book("demons", "Dostoevsky", 1873);

    }
}