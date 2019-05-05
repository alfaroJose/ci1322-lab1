package ucr.ac.ecci.ci1322.laboratorio1.model;

/**
 * Class that represents a book.
 */
public class Book {

    private String code;
    private String author;
    private String title;
    private String genre;

    /**
     * Class constructor
     * @param code
     * @param author
     * @param title
     * @param genre
     */
    public Book(String code, String author, String title, String genre) {
        this.code = code;
        this.author = author;
        this.title = title;
        this.genre = genre;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
