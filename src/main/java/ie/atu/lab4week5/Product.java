package ie.atu.lab4week5;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
  @NotBlank (message="This value not blank")
  private  String name;
  @Min(value=1, message="Value must be greater than 1")
  private int code;

}
