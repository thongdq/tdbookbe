package td.book.tdbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import td.book.tdbook.model.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {

}
