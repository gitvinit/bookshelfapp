package bookshelfapp.controllers;

import bookshelfapp.domain.Book;
import bookshelfapp.response.BookList;
import bookshelfapp.services.BookShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Vinit Badrike on 8/12/2017.
 */
@RestController
public class BookShelfController {

    private BookShelfService bookShelfService;

    @Autowired
    public void setBookShelfService(BookShelfService bookShelfService) {
        this.bookShelfService = bookShelfService;
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public BookList list(){
        return new BookList(bookShelfService.listAllBooks());
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public Book showBook(@PathVariable final Integer id){
       return bookShelfService.getBookById(id);
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public void saveBook(@RequestBody Book book){
        bookShelfService.saveBook(book);
    }

}
