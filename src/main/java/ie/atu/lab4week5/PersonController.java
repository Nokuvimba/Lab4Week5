package ie.atu.lab4week5;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    List<Person> personList =new ArrayList<>();

    @PostMapping("/createPerson")
    public List<Person>  addProduct(@Valid @RequestBody Person person){
        personList.add(person);
        return personList;
    }

}
