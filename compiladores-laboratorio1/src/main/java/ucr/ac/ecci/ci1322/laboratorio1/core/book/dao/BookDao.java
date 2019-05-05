package ucr.ac.ecci.ci1322.laboratorio1.core.book.dao;
import ucr.ac.ecci.ci1322.laboratorio1.model.Book;

/**
 * Interface for the connection to a DBMS of the class Book
 */
public interface BookDao {
    /**
     * Method to find a book by its id
     * @param id
     * @return Book
     */
    Book findById(String id);

    /**
     * Creates a new entry in the table Book in the DB
     * @param entity
     */
    void create(Book entity);

    /**
     * Updates an entry in the table Book in the DB
     * @param entity
     */
    void update(Book entity);

    /**
     *  Remove an entry in the table Book in the DB
     * @param entity
     */
    void remove(Book entity);
}
