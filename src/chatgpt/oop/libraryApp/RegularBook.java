package chatgpt.oop.libraryApp;

public class RegularBook extends Book{
    public RegularBook(String title, String author, int year, String isbn) {
        super(title, author, year, isbn);
    }

    @Override
    public String getType() {
        return "Regular Book";
    }
}
