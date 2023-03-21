package com.example.Deliverable3.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {
    //To do the dynamic exercise, this fake service was made
    private Map<String, Employee> employees = new HashMap<>();
    public ResponseEntity<Employee> processCreate(@RequestBody Employee employeeCreated){
        if(employeeCreated.getId() != null &&
                !StringUtils.isEmpty(employeeCreated.getFirstName()) &&
                !StringUtils.isEmpty(employeeCreated.getLastName()) &&
                !StringUtils.isEmpty(employeeCreated.getPhone()) &&
                !StringUtils.isEmpty(employeeCreated.getEmail()) &&
                !StringUtils.isEmpty(employeeCreated.getResidencyAddress()) &&
                !StringUtils.isEmpty(employeeCreated.getCityLocation()) &&
                employeeCreated.getLengthService() != null &&
                !StringUtils.isEmpty(employeeCreated.getRh()) &&
                !StringUtils.isEmpty(employeeCreated.getEmployeeType())){
            employeeCreated = new Employee(employeeCreated.getId(), employeeCreated.getFirstName(), employeeCreated.getLastName(), employeeCreated.getPhone(), employeeCreated.getEmail(), employeeCreated.getResidencyAddress(), employeeCreated.getCityLocation(), employeeCreated.getLengthService(), employeeCreated.getRh(), employeeCreated.getEmployeeType());
            employees.put(employeeCreated.getId(), employeeCreated);
            return ResponseEntity.ok(employeeCreated);
        }
        return ResponseEntity.badRequest().body(null);
    }

    public ResponseEntity<Employee> updateEmployee(String id, @RequestBody Employee employeeToUpdate) {
        Employee employee = employees.get(id);
        if (employee != null) {
            if (employeeToUpdate.getFirstName() != null) {
                employee.setFirstName(employeeToUpdate.getFirstName());
            }
            if (employeeToUpdate.getLastName() != null) {
                employee.setLastName(employeeToUpdate.getLastName());
            }
            if (employeeToUpdate.getPhone() != null) {
                employee.setPhone(employeeToUpdate.getPhone());
            }
            if (employeeToUpdate.getEmail() != null) {
                employee.setEmail(employeeToUpdate.getEmail());
            }
            if (employeeToUpdate.getResidencyAddress() != null) {
                employee.setResidencyAddress(employeeToUpdate.getResidencyAddress());
            }
            if (employeeToUpdate.getCityLocation() != null) {
                employee.setCityLocation(employeeToUpdate.getCityLocation());
            }
            if (employeeToUpdate.getLengthService() != null) {
                employee.setLengthService(employeeToUpdate.getLengthService());
            }
            if (employeeToUpdate.getRh() != null) {
                employee.setRh(employeeToUpdate.getRh());
            }
            if (employeeToUpdate.getEmployeeType() != null) {
                employee.setEmployeeType(employeeToUpdate.getEmployeeType());
            }
            return ResponseEntity.ok(employee);
        }
        return ResponseEntity.notFound().build();
    }

    public boolean deleteEmployee(String id) {
        Employee employee = employees.remove(id);
        return employee != null;
    }

    public Employee getEmployeeById(String id) {
        return employees.get(id);
    }

}

