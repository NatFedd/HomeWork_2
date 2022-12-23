package lesson2;

public class Book {
    private String name;
    private Author author;
    private int year;
    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "Название: " + this.name + " Автор: " + this.author.toString() + "Год выпуска: " + this.year;
    }

    public int hashCode() {
        return this.name.hashCode() * this.author.hashCode() * this.year;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return book.name.equals(name) && book.author.equals(author) && book.year == year;
    }


}