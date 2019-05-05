package ucr.ac.ecci.ci1322.laboratorio1.core.student.service;
import ucr.ac.ecci.ci1322.laboratorio1.model.Student;

/**
 * Interface for some the basic communication with a DB for the class Student
 */
public interface StudentService {
    /**
     * @param id
     * @return
     */
    Student findById(String id);

    /**
     * @param entity
     * @return
     */
    void create(Student entity);

    /**
     * @param entity
     */
    void update(Student entity);

    /**
     * @param entity
     */
    void remove(Student entity);
}
