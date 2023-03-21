package com.example.Deliverable3.Controller.EmployeeController;

import com.example.Deliverable3.Service.Employee;
import com.example.Deliverable3.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/employee")
    public ResponseEntity<Employee> employeeCreation(@RequestBody Employee employee){
        ResponseEntity<Employee> response = employeeService.processCreate(employee);
        return response;
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> employeeUpdate(@PathVariable String id, @RequestBody Employee employee){
        ResponseEntity<Employee> response = employeeService.updateEmployee(id,employee);
        return response;
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Void> employeeDelete(@PathVariable String id){
        boolean success = employeeService.deleteEmployee(id);
        if(success) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> employeeGet(@PathVariable String id){
        Employee employee = employeeService.getEmployeeById(id);
        if(employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
