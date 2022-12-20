package lesson1;

public class Main {

    public static void main(String[] args) {

        Book woeFromWit = new Book("woeFromWit", "Griboyedov", 1984);
        Book demons = new Book("demons", "Dostoevsky", 1873);

        System.out.println("book.title = " + Book.getTitle());
        System.out.println("book.author = " + Book.Author());
        System.out.println("book.yearPublication = " + Book.getYearPublication());

        Book.yearPublication = "1980";
        System.out.println("Book.yearPublication = " + Book.getYearPublication());



    }
}