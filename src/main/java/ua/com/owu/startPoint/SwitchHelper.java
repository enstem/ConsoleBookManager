package ua.com.owu.startPoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.owu.entity.Book;
import ua.com.owu.service.BookService;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SwitchHelper {
  private   ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:/META-INF/context.xml");
  private   BookService bookService = context.getBean(BookService.class);
    Scanner scanner = new Scanner(System.in);
    private int id;
    private String name;
    private String author;
    private String newname;
    private List<Book> books;
    public void add(){
        System.out.print("Enter bookname: ");
        name = scanner.next();
        System.out.print("Enter author: ");
        author = scanner.next();
        bookService.save(name,author);
    }
    public void remove(){
        System.out.print("Enter bookname: ");
        name = scanner.next();
         books =   bookService.findAllByName(name);
         if(books.size()==1){
             bookService.detete(name);
         }
         else if(books.size()>1){
             Iterator it = books.iterator();
             while (it.hasNext()){
                 Book book = (Book)it.next();
                 System.out.println(book);
             }
             System.out.println("We have found a few books with such name , ENTER book ID you want to remove");
             id = scanner.nextInt();
             bookService.delete(id);
         }
         else {
             System.out.println("There is no books with such name, try again");
         }
    }
    public void edit(){
        System.out.print("Enter bookname: ");
        name = scanner.next();
        System.out.print("Enter new bookname: ");
        newname = scanner.next();
        books =   bookService.findAllByName(name);
        if(books.size()==1){
            bookService.update(name,newname);
        }
        else if(books.size()>1){
            Iterator it = books.iterator();
            while (it.hasNext()){
                Book book = (Book)it.next();
                System.out.println(book);
            }
            System.out.println("We have found a few books with such name , ENTER book ID you want to remove");
            id = scanner.nextInt();
            bookService.update(id,newname);
        }
        else {
            System.out.println("There is no books with such name, try again");
        }
    }
    public void showAll(){

       Iterator it =  bookService.findAll().iterator();
        while (it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book);
        }
    }
}
