package ucr.ac.ecci.ci1322.laboratorio1.core.book.dao;

import ucr.ac.ecci.ci1322.laboratorio1.model.Book;
import java.sql.*;

/**
 * Class that implements the connection service to a DB for the Book class
 */
public class JdbcBookService implements BookDao {

    private Connection connection;

    public JdbcBookService() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/automatas_lab1", "root", "password");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Book findById(String id) {
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT * FROM books WHERE id = " + id + ";");
            rs.next();
            String code = rs.getString(1);
            String title = rs.getString(2);
            String author = rs.getString(3);
            String genre = rs.getString(4);
            return new Book(code, title, author, genre);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void create(Book entity) {
        try{
            String query = "INSERT INTO books  VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString (1, entity.getCode());
            preparedStmt.setString (2, entity.getTitle());
            preparedStmt.setString (3, entity.getAuthor());
            preparedStmt.setString (4, entity.getGenre());
            preparedStmt.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Book entity) {
    }

    @Override
    public void remove(Book entity) {
    }
}
