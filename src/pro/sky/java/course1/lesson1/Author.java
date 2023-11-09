package pro.sky.java.course1.lesson1;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;
    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    @Override
    public String toString() {
        return "Автор: " + this.name + " " +this.surname;
    }
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
}
