package ucr.ac.ecci.ci1322.laboratorio1.core.student.service;

import ucr.ac.ecci.ci1322.laboratorio1.core.student.dao.JdbcStudentService;
import ucr.ac.ecci.ci1322.laboratorio1.core.student.dao.StudentDao;
import ucr.ac.ecci.ci1322.laboratorio1.model.Student;

/**
 * Class that creates a new connection with the DB an allows to use some basic operations in the DB for the Student class
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public StudentServiceImpl(){
        studentDao = new JdbcStudentService();
    }

    @Override
    public Student findById(String id) {
        return studentDao.findById(id);
    }

    @Override
    public void create(Student entity) {
        studentDao.create(entity);
    }

    @Override
    public void update(Student entity) {
        studentDao.update(entity);
    }

    @Override
    public void remove(Student entity) {
        studentDao.remove(entity);
    }
}
