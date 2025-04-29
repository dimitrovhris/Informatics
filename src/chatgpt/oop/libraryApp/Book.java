package chatgpt.oop.libraryApp;

public abstract class Book {
    private String title;
    private String author;
    private int year;
    private String isbn;

    public Book(String title, String author, int year, String isbn) {
        setIsbn(title);
        setAuthor(author);
        setYear(year);
        setIsbn(isbn);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.isEmpty()) {
            throw new IllegalArgumentException("Title and author cannot be empty!");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author.isEmpty()) {
            throw new IllegalArgumentException("Title and author cannot be empty!");
        }
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year <= 1400){
            throw new IllegalArgumentException("Year must be after 1400!");
        }
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if(isbn.length() != 13){
            throw new IllegalArgumentException("Invalid ISBN length!");
        }
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return String.format("%s by %s (%d) - ISBN: %s", getTitle(), getAuthor(), getYear(), getIsbn());
    }

    public abstract String getType();
}
