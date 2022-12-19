package lesson1;

public class Main {
    public static void main(String[] args) {

        Book1.yearPublication = "1984";
        System.out.println("Author.name = " + Author.getName());
        System.out.println("Author.surname = " + Author.getSurname());
        System.out.println("Author.yearPublication = " + Author.getYearPublication());
        Author.yearPublication = "1980";
        System.out.println("Author.yearPublication = " + Author.getYearPublication());

    }
}