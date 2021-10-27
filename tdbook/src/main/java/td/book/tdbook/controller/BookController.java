package td.book.tdbook.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import td.book.tdbook.model.Book;
import td.book.tdbook.model.BookDetail;
import td.book.tdbook.payload.book.BookDetailDTO;
import td.book.tdbook.repository.BookDetailRepository;
import td.book.tdbook.repository.BookRepository;
import td.book.tdbook.service.BookService;
import td.book.tdbook.service.RoleService;
import td.book.tdbook.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    UserService userService;

    // @Autowired
    // RoleService roleService;

    // @Autowired
    // BookDetailRepository bookDetailRepository;
    
    @GetMapping
    public List<Book> getAllBooks(){
        //return bookService.findAll();
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") long id) {
        // Optional<Book> book = bookRepository.findById(id);

        // if(book.isPresent()) {
        //     return new ResponseEntity<>(book.get(), HttpStatus.OK);
        // } else {
        //     return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        // }
        return null;
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<BookDetailDTO> getBookDetail(@PathVariable("id") long id) {
        // Optional<Book> book = bookRepository.findById(id);

        // if (book.isPresent()) {
        //     BookDetailDTO bookDetail = new BookDetailDTO();
        //     bookDetail.setId(book.get().getId());
        //     bookDetail.setTitle(book.get().getTitle());
        //     if(book.get().getBookDetail() != null) {
        //         bookDetail.setContent(book.get().getBookDetail().getContent());
        //     }
        //     bookDetail.setAuthor(book.get().getAuthor());
        //     return new ResponseEntity<>(bookDetail, HttpStatus.OK);
        // } else {
        //     return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        // }
        return null;
    }

    @PostMapping("/detail")
    public ResponseEntity<HttpStatus> saveBookDetail(@RequestBody BookDetail bookDetail) {
        // try{
        //     BookDetail bd = new BookDetail();
        //     bd.setContent(bookDetail.getContent());
        //     bookDetailRepository.save(bd);
        //     return new ResponseEntity<>(HttpStatus.OK);
        // } catch (Exception e) {
        //     return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        // }
        return null;
    }

}
