package ucr.ac.ecci.ci1322.laboratorio1.build;

import org.apache.poi.hssf.usermodel.HSSFDataFormatter;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import ucr.ac.ecci.ci1322.laboratorio1.core.book.service.BookService;
import ucr.ac.ecci.ci1322.laboratorio1.core.book.service.BookServiceImpl;
import ucr.ac.ecci.ci1322.laboratorio1.core.student.service.StudentService;
import ucr.ac.ecci.ci1322.laboratorio1.core.student.service.StudentServiceImpl;
import ucr.ac.ecci.ci1322.laboratorio1.model.Book;
import ucr.ac.ecci.ci1322.laboratorio1.model.Student;
import java.io.FileInputStream;

/**
 * Class that loads the information from an .xml file to a DB
 */
public class DataLoader {

    private static StudentService studentService;
    private static BookService bookService;
    private static HSSFDataFormatter dataFormatter;

    /**
     * Class constructor
     */
    public DataLoader(){
        studentService = new StudentServiceImpl();
        bookService = new BookServiceImpl();
        dataFormatter = new HSSFDataFormatter();
    }

    /**
     * Method that loads each row in the .xml file to a new entry in the table Students
     * @param sheet the .xml file
     */
    public void loadStudents(HSSFSheet sheet){
        sheet.forEach( row -> {
            String studenId  = dataFormatter.formatCellValue(row.getCell(0));
            String id = dataFormatter.formatCellValue(row.getCell(1));
            String lastName = dataFormatter.formatCellValue(row.getCell(2));
            String firstName = dataFormatter.formatCellValue(row.getCell(3));
            String email = dataFormatter.formatCellValue(row.getCell(4));
            studentService.create(new Student(studenId, id, lastName, firstName, email));
        });
    }

    /**
     * Method that loads each row in the .xml file to a new entry in the table Book
     * @param sheet the .xml file
     */
    public void loadBooks(HSSFSheet sheet){
        sheet.forEach( row -> {
            String code  = dataFormatter.formatCellValue(row.getCell(0));
            String title = dataFormatter.formatCellValue(row.getCell(1));
            String author = dataFormatter.formatCellValue(row.getCell(2));
            String genre = dataFormatter.formatCellValue(row.getCell(3));
            bookService.create(new Book(code, title, author, genre));
        });
    }

    public static void main(String[] args){
        DataLoader dataLoader = new DataLoader();
        FileInputStream fileIn;
        try{
            fileIn = new FileInputStream("C:\\Users\\josea\\Desktop\\ci1322-lab1.git\\compiladores-laboratorio1\\src\\main\\resources\\Lab1.xls");
            POIFSFileSystem fs = new POIFSFileSystem(fileIn);
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            HSSFSheet sheetStudents = wb.getSheetAt(0);
            HSSFSheet sheetBooks = wb.getSheetAt(1);
            dataLoader.loadStudents(sheetStudents);
            dataLoader.loadBooks(sheetBooks);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
