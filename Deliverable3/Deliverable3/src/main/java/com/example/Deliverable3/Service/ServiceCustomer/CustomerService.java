package com.example.Deliverable3.Service.ServiceCustomer;

import com.example.Deliverable3.Modules.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;
@Service
public class CustomerService {
    private Map<String, Customer> customers = new HashMap<>();
    public ResponseEntity<Customer> processCreate(@RequestBody Customer customerCreated){
        if(customerCreated.getId() != null &&
                !StringUtils.isEmpty(customerCreated.getFirstName()) &&
                !StringUtils.isEmpty(customerCreated.getLastName()) &&
                !StringUtils.isEmpty(customerCreated.getPhone()) &&
                !StringUtils.isEmpty(customerCreated.getEmail()) &&
                !StringUtils.isEmpty(customerCreated.getResidencyAddress()) &&
                !StringUtils.isEmpty(customerCreated.getCityLocation())){
            customerCreated = new Customer(customerCreated.getId(), customerCreated.getFirstName(), customerCreated.getLastName(), customerCreated.getPhone(), customerCreated.getEmail(), customerCreated.getResidencyAddress(), customerCreated.getCityLocation());
            customers.put(customerCreated.getId(), customerCreated);
            return ResponseEntity.ok(customerCreated);
        }
        return ResponseEntity.badRequest().body(null);
    }

    public ResponseEntity<Customer> updateEmployee(String id, @RequestBody Customer customerToUpdate) {
        Customer customer = customers.get(id);
        if (customer != null) {
            if (customerToUpdate.getFirstName() != null) {
                customer.setFirstName(customerToUpdate.getFirstName());
            }
            if (customerToUpdate.getLastName() != null) {
                customer.setLastName(customerToUpdate.getLastName());
            }
            if (customerToUpdate.getPhone() != null) {
                customer.setPhone(customerToUpdate.getPhone());
            }
            if (customerToUpdate.getEmail() != null) {
                customer.setEmail(customerToUpdate.getEmail());
            }
            if (customerToUpdate.getResidencyAddress() != null) {
                customer.setResidencyAddress(customerToUpdate.getResidencyAddress());
            }
            if (customerToUpdate.getCityLocation() != null) {
                customer.setCityLocation(customerToUpdate.getCityLocation());
            }
            return ResponseEntity.ok(customer);
        }
        return ResponseEntity.notFound().build();
    }
    public boolean deleteCustomer(String id) {
        Customer customer = customers.remove(id);
        return customer != null;
    }

    public Customer getCustomerById(String id) {
        return customers.get(id);
    }
}
