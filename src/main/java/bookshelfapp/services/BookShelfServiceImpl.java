package bookshelfapp.services;

import bookshelfapp.domain.Book;
import bookshelfapp.repositories.BookShelfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Vinit Badrike on 8/13/2017.
 */
@Service
public class BookShelfServiceImpl implements BookShelfService {
    private BookShelfRepository bookShelfRepository;

    @Autowired
    public void setRepository(BookShelfRepository bookShelfRepository) {
        this.bookShelfRepository = bookShelfRepository;
    }

    @Override
    public Iterable<Book> listAllBooks() {
        return bookShelfRepository.findAll();
    }

    @Override
    public Book getBookById(Integer id) {
        return bookShelfRepository.findOne(id);
    }

    @Override
    public void saveBook(Book book) {
        bookShelfRepository.save(book);
    }
}

