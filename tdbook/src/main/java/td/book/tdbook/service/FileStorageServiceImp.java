package td.book.tdbook.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import td.book.tdbook.model.Image;
import td.book.tdbook.repository.ImageRepository;

@Service
public class FileStorageServiceImp implements FileStorageService {

    // @Autowired
    // private ImageRepository imageRepository;

    @Override
    public Image store(MultipartFile file) throws IOException {
        // String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        // Image img = new Image();
        // img.setName(fileName);
        // img.setType(file.getContentType());
        // img.setImg(file.getBytes());

        // return imageRepository.save(img);
        return null;
    }

    @Override
    public Image getFile(Long id) {
        //return imageRepository.findById(id).get();
        return null;
    }

    @Override
    public Stream<Image> getAllFiles() {
        //return imageRepository.findAll().stream();
        return null;
    }

    @Override
    public void delele(Long id) {
        //imageRepository.deleteById(id);
    }
}
