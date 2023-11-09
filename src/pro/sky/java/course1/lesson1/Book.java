package pro.sky.java.course1.lesson1;

import java.util.Objects;

public class Book {
    private String nameOfBook;
    private Author author;
    private int yearOfPublishing;
    public Book(String nameOfBook, Author author, int yearOfPublishing){
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }
    public String getNameOfBook(){
        return this.nameOfBook;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getYearOfPublishing(){
        return this.yearOfPublishing;
    }
    public void setYearOfPublishing(int yearOfPublishing){
        this.yearOfPublishing = yearOfPublishing;
    }
    @Override
    public String toString() {
        return "Название книги: "+this.nameOfBook+ ", " + this.author.toString() + ", Год публикации: " + this.yearOfPublishing;
    }
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return yearOfPublishing == book.yearOfPublishing && Objects.equals(nameOfBook, book.nameOfBook) && Objects.equals(author, book.author);
    }
    public int hashCode() {
        return java.util.Objects.hash(nameOfBook, author, yearOfPublishing);
    }

}
