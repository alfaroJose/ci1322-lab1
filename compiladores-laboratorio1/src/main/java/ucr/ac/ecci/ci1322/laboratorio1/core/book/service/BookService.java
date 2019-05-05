package ucr.ac.ecci.ci1322.laboratorio1.core.book.service;
import ucr.ac.ecci.ci1322.laboratorio1.model.Book;

/**
 * Interface for some the basic communication with a DB for the class Student
 */
public interface BookService {
    /**
     * @param id
     * @return
     */
    Book findById(String id);

    /**
     * @param entity
     * @return
     */
    void create(Book entity);

    /**
     * @param entity
     */
    void update(Book entity);

    /**
     * @param entity
     */
    void remove(Book entity);
}
