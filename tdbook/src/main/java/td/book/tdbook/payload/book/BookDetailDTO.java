package td.book.tdbook.payload.book;

import lombok.Data;

@Data
public class BookDetailDTO {

    private Long id;
    private String title;
    private String content;
    private String author;

}
