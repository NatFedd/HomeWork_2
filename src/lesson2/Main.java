package lesson2;

public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Иван", "Иванов");
        Author secondAuthor = new Author("Петр", "Петров");
        Author thirdAuthor = new Author("Петр", "Петров");
        Book firstBook = new Book("Букварь", firstAuthor, 2012);
        Book secondBook = new Book("Синяя", secondAuthor, 2014);
        Book thirdBook = new Book("Синяя", secondAuthor, 2014);

        System.out.println(firstAuthor.toString());
        System.out.println(secondAuthor.toString());

        System.out.println(firstBook.toString());
        System.out.println(secondBook.toString());

        System.out.println(firstAuthor.hashCode());
        System.out.println(secondAuthor.hashCode());

        System.out.println(firstBook.hashCode());
        System.out.println(secondBook.hashCode());

        System.out.println(firstAuthor.equals(secondAuthor));
        System.out.println(secondAuthor.equals(thirdAuthor));

        System.out.println(firstBook.equals(secondBook));
        System.out.println(secondBook.equals(thirdBook));

    }
}