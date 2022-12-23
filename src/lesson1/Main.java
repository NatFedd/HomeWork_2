package lesson1;

public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Иван", "Иванов");
        Author secondAuthor = new Author("Петр", "Петров");
        Book firstBook = new Book("Букварь", firstAuthor, 2012);
        Book secondBook = new Book("Синяя", secondAuthor, 2014);
        secondBook.setYear(2020);
    }
}