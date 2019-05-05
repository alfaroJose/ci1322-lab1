package ucr.ac.ecci.ci1322.laboratorio1.core.student.dao;

import ucr.ac.ecci.ci1322.laboratorio1.model.Student;
import java.sql.*;

/**
 * Class that implements the connection service to a DB for the Student class
 */
public class JdbcStudentService implements StudentDao {

    private Connection connection;

    public JdbcStudentService(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/automatas","root","password");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Student findById(String id) {
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT * FROM students WHERE id = " + id );
            String studentId = rs.getString("studentId");
            String sid = rs.getString("id");
            String lastName = rs.getString("lastName");
            String firstName = rs.getString("firstName");
            String email = rs.getString("email");

            Student student = new Student(studentId, sid, lastName, firstName, email);
            return student;
        }catch(Exception e){
            e.printStackTrace();;
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void create(Student entity) {
        try{
            String query = " INSERT INTO students  VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString (1, entity.getStudentId());
            preparedStmt.setString (2, entity.getId());
            preparedStmt.setString (3, entity.getLastName());
            preparedStmt.setString (4, entity.getFirstName());
            preparedStmt.setString (5, entity.getEmail());
            preparedStmt.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Student entity) {

    }

    @Override
    public void remove(Student entity) {

    }
}
