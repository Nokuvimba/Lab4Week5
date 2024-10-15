package ie.atu.lab4week5;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    @NotBlank(message = "name is not black")
    private String name;
    @NotBlank(message = "title is not black")
    private String title;
    @Min(value=1,message = "employeeId is not null")
    private int employeeId;
    @Min(value = 16,message = "age is not less that 16")
    private int age;
    @Email(message = "Invalid email address")
    private String email;
    @NotBlank(message = "position not blank")
    private String position;
    @NotBlank(message = "department not blank")
    private  String department;
}
