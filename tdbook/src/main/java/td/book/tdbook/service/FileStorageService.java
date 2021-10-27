package td.book.tdbook.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.web.multipart.MultipartFile;

import td.book.tdbook.model.Image;

public interface FileStorageService {

    public Image store(MultipartFile file) throws IOException;

    public Image getFile(Long id);

    public Stream<Image> getAllFiles();

    public void delele(Long id);
}
