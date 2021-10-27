package td.book.tdbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import td.book.tdbook.model.Book;
import td.book.tdbook.repository.BookRepository;

@Service
public class BookServiceImp implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
