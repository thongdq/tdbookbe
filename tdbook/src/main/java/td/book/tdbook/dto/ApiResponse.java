package td.book.tdbook.dto;

import lombok.Value;

//Lombok Value annotation (@Value) is used when creating Immutable classes.
//All Lombok generated fields are made  private and  final  by default, and setters are not generated.
//The class itself is also made final by default.
@Value
public class ApiResponse {
    private Boolean success;
    private String message;
}
