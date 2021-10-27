package td.book.tdbook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

//@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "images")
public class Image {

    public Image(String fileName, String contentType, Object object, byte[] bytes) {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull private Long id;

    @Column
    private String name;

    @Column
    private String type;

    @Column
    private String url;

    @Column
    //@Lob if using this annotation => ERROR: column "img" is of type bytea but expression is of type bigint
    private byte[] img;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    

}
