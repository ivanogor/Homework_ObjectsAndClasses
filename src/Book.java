class Book {
    private final String title;
    private int yearOfPublication;
    private final Author author;

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
