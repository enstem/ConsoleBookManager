package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.dao.impl.BookDAOImpl;
import ua.com.owu.entity.Book;
import ua.com.owu.service.BookService;

import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {
   @Autowired
  private   BookDAOImpl dao;


    public void delete(int id) {
        dao.delete(id);
    }

    public void detete(String name) {
        dao.delete(name);
    }

    public void update(int id, String newname) {
        dao.update(id,newname);
    }

    public void update(String name, String newname) {
        dao.update(name,newname);
    }


    public void save(String name, String author) {
        dao.save(new Book(name,author));
    }

    public List<Book> findAll() {
        return dao.findAll();
    }

    public List<Book> findAllByName(String name) {
        return dao.findAllByName(name);
    }


}
