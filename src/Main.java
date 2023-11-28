public class Main {
    public static void main(String[] args) {
        Author turgenev = new Author("Ivan", "Turgenev");
        Author griboedov = new Author("Aleksandr", "Griboedov");

        Book woeFromWit = new Book("Woe from Wit", 1825, griboedov);
        Book fatherAndSons = new Book("Father & Sons", 1858, turgenev);

        woeFromWit.setYearOfPublication(1862);
    }
}



