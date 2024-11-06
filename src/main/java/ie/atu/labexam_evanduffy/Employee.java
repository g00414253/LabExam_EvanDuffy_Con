package ie.atu.labexam_evanduffy;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Pattern(regexp = "EMP-",message = "Invalid Format")
    private String employeeCode;

    @Max(value = 100,message = "Maximum Characters")
    @NotBlank(message = "Must be filled")
    private String name;

    @Email(message = "Invalid Email")
    private String email;

    @Pattern(regexp = "Manager",message = "Must be a valid position")
    @NotBlank(message = "Must be filled")
    private String position;

    @Min(value = 1,message = "Must be a positive value")
    private double salary;

    private String dateOfJoining;
}
