package ucr.ac.ecci.ci1322.laboratorio1.core.student.dao;
import ucr.ac.ecci.ci1322.laboratorio1.model.Student;

/**
 * Interface for the connection to a DBMS of the class Student
 */
public interface StudentDao {
    /**
     * Method to find a student by its id
     * @param id
     * @return
     */
    Student findById(String id);

    /**
     * Creates a new entry in the table Book in the DB
     * @param entity
     * @return
     */
    void create(Student entity);

    /**
     * Updates an entry in the table Book in the DB
     * @param entity
     */
    void update(Student entity);

    /**
     * Remove an entry in the table Book in the DB
     * @param entity
     */
    void remove(Student entity);
}
