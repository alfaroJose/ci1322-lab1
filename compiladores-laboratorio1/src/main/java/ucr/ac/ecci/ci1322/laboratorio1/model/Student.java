package ucr.ac.ecci.ci1322.laboratorio1.model;

public class Student {

    private String studenId;
    private int id;
    private String lastName;
    private String firstName;
    private String email;

    public Student(String studenId, int id, String lastName, String firstName, String email) {
        this.studenId = studenId;
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }

    public Student() {
        this.studenId = "";
        this.id = 0;
        this.lastName = "";
        this.firstName = "";
        this.email = "";
    }

    public String getStudenId() {
        return studenId;
    }

    public void setStudenId(String studenId) {
        this.studenId = studenId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
