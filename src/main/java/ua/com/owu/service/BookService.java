package ua.com.owu.service;

import ua.com.owu.entity.Book;

import java.util.List;

public interface BookService  {
   void delete(int id);
   void detete(String name);
    void update(int id,String newname);
    void update(String name,String newname);
    void save(String name,String author);
    List<Book> findAll();
    List<Book> findAllByName(String name);

}
