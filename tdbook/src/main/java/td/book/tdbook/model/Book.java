// https://www.baeldung.com/jpa-one-to-one

package td.book.tdbook.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.NonNull;

@Entity
@Table(name = "BOOKS")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull private Long id;

    @Column(name = "TITLE", length = 200)
    private String title;

    @Column(name = "AUTHOR", length = 200)
    private String author;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_detail_id")
    private BookDetail bookDetail;

    public Book(){};

    public Book(Long id, String title, String author, BookDetail bookDetail) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.bookDetail = bookDetail;
    }

    public Book(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookDetail getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(BookDetail bookDetail) {
        this.bookDetail = bookDetail;
    }

}
