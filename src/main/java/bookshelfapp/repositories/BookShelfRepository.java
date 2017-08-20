package bookshelfapp.repositories;

import bookshelfapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Vinit Badrike on 8/13/2017.
 */
public interface BookShelfRepository extends CrudRepository<Book,Integer>{

}
