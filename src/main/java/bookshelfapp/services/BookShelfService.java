package bookshelfapp.services;

import bookshelfapp.domain.Book;

/**
 * Created by Vinit Badrike on 8/13/2017.
 */
public interface BookShelfService {
    /**
     * Returns list of books.
     * @return
     */
    Iterable<Book> listAllBooks();

    /**
     * Returns book by id.
     * @param id
     * @return
     */
    Book getBookById(Integer id);

    /**
     * Saves book in shelf.
     * @param book
     */
    void saveProduct(Book book);
}
