package bookshelfapp.response;

import bookshelfapp.domain.Book;

/**
 * Created by Vinit Badrike on 8/13/2017.
 */
public class BookList {
    private Iterable<Book> books;

    public BookList(Iterable<Book> books){
        this.books = books;
    }

    public Iterable<Book> getBooks() {
        return books;
    }

    public void setBooks(Iterable<Book> books) {
        this.books = books;
    }
}
