package pro.sky.java.course1.lesson1;

public class MainHw12 {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев", "Толстой");
        Book ruslanILyudmila = new Book("Руслан и Людмила", pushkin, 1820);
        Book voynaIMir = new Book("Война и мир", tolstoy, 1869);
        System.out.println(voynaIMir.getAuthor().getName() + " " + voynaIMir.getAuthor().getSurname());
        System.out.println("Написал книгу " + voynaIMir.getNameOfBook() + " в " +
                voynaIMir.getYearOfPublishing() + " году");
        System.out.println(ruslanILyudmila.getAuthor().getName()+ " " +ruslanILyudmila.getAuthor().getSurname());
        System.out.println("Написал книгу " + ruslanILyudmila.getNameOfBook() + " в " +
                ruslanILyudmila.getYearOfPublishing() + " году");
        voynaIMir.setYearOfPublishing(1890);
        System.out.println(voynaIMir.getAuthor().getName() + " " + voynaIMir.getAuthor().getSurname());
        System.out.println("Написал книгу " + voynaIMir.getNameOfBook() + " в " +
                voynaIMir.getYearOfPublishing() + " году");
        System.out.println(pushkin);
        System.out.println(tolstoy);
        System.out.println(ruslanILyudmila);
        System.out.println(voynaIMir.equals(ruslanILyudmila));
        System.out.println(ruslanILyudmila.hashCode());

    }
}
