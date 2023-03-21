package com.example.Deliverable3.Controller.CustomerController;

import com.example.Deliverable3.Modules.Customer;
import com.example.Deliverable3.Service.ServiceCustomer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer")
    public ResponseEntity<Customer> customerCreation(@RequestBody Customer customerCreated){
        ResponseEntity<Customer> response = customerService.processCreate(customerCreated);
        return response;
    }

    @PutMapping("/customer/{id}")
    public ResponseEntity<Customer> customerUpdate(@PathVariable String id, @RequestBody Customer customer){
        ResponseEntity<Customer> response = customerService.updateEmployee(id,customer);
        return response;
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<Void> customerDelete(@PathVariable String id){
        boolean success = customerService.deleteCustomer(id);
        if(success) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> customerGet(@PathVariable String id){
        Customer customer = customerService.getCustomerById(id);
        if(customer != null) {
            return ResponseEntity.ok(customer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
