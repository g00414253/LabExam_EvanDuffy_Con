package ie.atu.labexam_evanduffy;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeService myEmployee;
    public EmployeeController(EmployeeService myEmployee){
        this.myEmployee=myEmployee;
    }

    @PostMapping("/addEmployee")
    public List<Employee> addEmployee(@Valid @RequestBody Employee employee){
        return myEmployee.addEmployee(employee);
    }

    @GetMapping("/getEmployee/{employeeCode}")
    public List<Employee> getEmployee(@PathVariable @RequestBody String employeeCode){
        return myEmployee.getEmployee(employeeCode);
    }

    @DeleteMapping("/deleteEmployee/{employeeCode}")
    public List<Employee> deleteEmployee(@PathVariable @RequestBody String employeeCode){
        return myEmployee.deleteEmployee(employeeCode);
    }

    @PutMapping("/updateEmployee/{employeeCode}")
    public List<Employee> updateEmployee(@PathVariable @RequestBody String employeeCode){
        return myEmployee.updateEmployee(employeeCode);
    }
}
