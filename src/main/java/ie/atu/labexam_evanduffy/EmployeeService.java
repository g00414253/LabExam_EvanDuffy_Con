package ie.atu.labexam_evanduffy;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> myList = new ArrayList<>();
    public List<Employee> addEmployee(Employee employee){
        myList.add(employee);
        return myList;
    }

    public List<Employee> getEmployee(String employeeCode){
        return myList;
    }

    public List<Employee> updateEmployee(String employeeCode){

        return myList;
    }

    public List<Employee> deleteEmployee(String id){
        myList.remove(id);
        return myList;
    }
}
