package td.book.tdbook.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import td.book.tdbook.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
