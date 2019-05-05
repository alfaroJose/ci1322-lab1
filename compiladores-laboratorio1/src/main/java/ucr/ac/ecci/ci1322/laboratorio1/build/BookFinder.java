package ucr.ac.ecci.ci1322.laboratorio1.build;

import ucr.ac.ecci.ci1322.laboratorio1.core.book.service.BookService;
import ucr.ac.ecci.ci1322.laboratorio1.core.book.service.BookServiceImpl;
import ucr.ac.ecci.ci1322.laboratorio1.model.Book;
import java.util.Scanner;

/**
 * Class that asks the user for a book code to search it on the DB and print
 * on console it's information.
 */
public class BookFinder {
    public static void main (String[] args){
        try{
            BookService bookService = new BookServiceImpl();
            System.out.println("Enter the code of the book you need to find: ");
            Scanner scanner = new Scanner(System.in);
            String code = scanner.nextLine();
            Book book = bookService.findById(code);
            System.out.println("code: " + book.getCode() +
                    "\ntitle: " + book.getTitle() +
                    "\nauthor: " +book.getAuthor() +
                    "\ngenre: " +book.getGenre());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
