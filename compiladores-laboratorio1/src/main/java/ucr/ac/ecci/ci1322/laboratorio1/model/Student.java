package ucr.ac.ecci.ci1322.laboratorio1.model;

/**
 * Class that represents a student
 */
public class Student {

    private String studentId;
    private String id;
    private String lastName;
    private String firstName;
    private String email;

    public Student(String studentId, String id, String lastName, String firstName, String email) {
        this.studentId = studentId;
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
