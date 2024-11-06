package ie.atu.labexam_evanduffy;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> myList = new ArrayList<>();
    public List<Employee> addEmployee(Employee employee){
        myList.add(employee);
        return myList;
    }

    public List<Employee> getEmployee(@RequestParam String employeeCode){
        return myList;
    }

    public List<Employee> updateEmployee(@RequestParam String employeeCode){
        return myList;
    }

    public List<Employee> deleteEmployee(@RequestParam String employeeCode){
        myList.remove(employeeCode);
        return myList;
    }
}
