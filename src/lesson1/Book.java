package lesson1;

public class Book {
    private String name;    private Author author;    private int year;    public Book(String name, Author author, int year) {
        this.name = name;        this.author = author;        this.year = year;    }
    public void setName(String name) {
        this.name = name;    }
    public void setAuthor(Author author) {
        this.author = author;    }
    public void setYear(int year) {
        this.year = year;    }
    public String getName() {
        return name;    }
    public Author getAuthor() {
        return author;    }
    public int getYear() {
        return year;
    }
}