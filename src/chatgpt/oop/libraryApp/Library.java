package chatgpt.oop.libraryApp;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }
    public void listBooksByType(String type){
        for(Book book: books){
            if(book.getType().equals(type)){
                System.out.println(book);
            }
        }
    }
    public Book findBookByISBN(String isbn){
        for(Book book: books){
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }

}
