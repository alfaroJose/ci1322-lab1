package ucr.ac.ecci.ci1322.laboratorio1.core.book.service;

import ucr.ac.ecci.ci1322.laboratorio1.core.book.dao.BookDao;
import ucr.ac.ecci.ci1322.laboratorio1.core.book.dao.JdbcBookService;
import ucr.ac.ecci.ci1322.laboratorio1.model.Book;

/**
 * Class that creates a new connection with the DB an allows to use some basic operations in the DB for the Book class
 */
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public BookServiceImpl(){
        bookDao = new JdbcBookService();
    }

    @Override
    public Book findById(String id) {
        return bookDao.findById(id);
    }

    @Override
    public void create(Book entity) {
        bookDao.create(entity);
    }

    @Override
    public void update(Book entity) {
        bookDao.update(entity);
    }

    @Override
    public void remove(Book entity) {
        bookDao.remove(entity);
    }
}
