public class Main {
    public static void main(String[] args) {
        Author turgenev = new Author("Ivan", "Turgenev");
        Author griboedov = new Author("Aleksandr", "Griboedov");

        Book woeFromWit = new Book("Woe from Wit", 1825, griboedov);
        Book fatherAndSons = new Book("Father & Sons", 1858, turgenev);

        woeFromWit.setYearOfPublication(1862);
    }
}

class Book {
    private String title;
    private int yearOfPublication;
    private Author author;

    public Book(String title, int yearOfPublication, Author author) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}

class Author {
    final private String firstName;
    final private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}