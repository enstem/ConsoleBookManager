package ua.com.owu.dao;
import ua.com.owu.entity.Book;

import java.util.List;

public interface BookDAO {
   void save(Book book);
    void delete(String name);
    void delete(int id);
    void update(String name,String newname);
    void update(int id,String newname);
    List<Book> findAll();
    List<Book> findAllByName(String name);
}
