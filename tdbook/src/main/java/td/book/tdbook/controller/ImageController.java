package td.book.tdbook.controller;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import td.book.tdbook.model.Image;
import td.book.tdbook.payload.file.ResponseFile;
import td.book.tdbook.payload.response.MessageResponse;
import td.book.tdbook.repository.ImageRepository;
import td.book.tdbook.service.FileStorageService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/images")
public class ImageController {

    // @Autowired
    // ImageRepository imageRepository;

    // @Autowired
    // private FileStorageService fileStorageService;

    // @PostMapping("/upload")
    // public ResponseEntity<MessageResponse> uploadImgae(@RequestParam("file") MultipartFile file) throws IOException {
    //     String message = "";
    //     try {
    //         fileStorageService.store(file);

    //         message = "Uploaded the file successfully: " + file.getOriginalFilename();
    //         return ResponseEntity.status(HttpStatus.OK).body(new MessageResponse(message));
    //     } catch(Exception e) {
    //         message = "Could not upload the file: " + file.getOriginalFilename() + "!";
    //         return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new MessageResponse(message));
    //     }
    // }

    // @GetMapping()
    // public ResponseEntity<List<ResponseFile>> getListFiles() {

    //     List<ResponseFile> files = fileStorageService.getAllFiles().map(file -> {
    //         String fileDownloadUri = ServletUriComponentsBuilder
    //                                     .fromCurrentContextPath()
    //                                     .path("/images/")
    //                                     .path(file.getId().toString())
    //                                     .toUriString();

    //         return new ResponseFile(
    //             file.getId(),
    //             file.getName(),
    //             fileDownloadUri,
    //             file.getType(),
    //             file.getImg().length
    //         );
    //     }).collect(Collectors.toList());

    //     return ResponseEntity.status(HttpStatus.OK).body(files);

    // }

    // @GetMapping("/{id}")
    // public ResponseEntity<byte[]> getImage(@PathVariable("id") long id) {
    //     Image img = fileStorageService.getFile(id);

    //     return ResponseEntity.ok()
    //         .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + img.getName() + "\"")
    //         .body(img.getImg());
    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<HttpStatus> delete(@PathVariable("id") long id) {
    //     try {
    //         fileStorageService.delele(id);
    //         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    //     } catch(Exception e) {
    //         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    //     }
    // }

    // public static byte[] compressBytes(byte[] data) {
    //     Deflater deflater = new Deflater();
    //     deflater.setInput(data);
    //     deflater.finish();

    //     ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
    //     byte[] buffer = new byte[1024];
    //     while(!deflater.finished()) {
    //         int count = deflater.deflate(buffer);
    //         outputStream.write(buffer, 0, count);
    //     }
    //     try {
    //         outputStream.close();
    //     } catch(IOException e) {

    //     }

    //     return outputStream.toByteArray();
    // }

    // public static byte[] decompressBytes(byte[] data) {
    //     Inflater inflater = new Inflater();
    //     inflater.setInput(data);
    //     ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
    //     byte[] buffer = new byte[1024];
    //     try {
    //         while (!inflater.finished()) {
    //             int count = inflater.inflate(buffer);
    //             outputStream.write(buffer, 0, count);
    //         }
    //         outputStream.close();
    //     } catch(IOException e) {

    //     } catch(DataFormatException e) {

    //     }
    //     return outputStream.toByteArray();
    // }
}
