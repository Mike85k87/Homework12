package pro.sky.java.course1.lesson1;

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

}
