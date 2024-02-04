package com.xa.crmgena.crm.controllers;


import com.xa.crmgena.crm.dtos.CustomerDTO;
import com.xa.crmgena.crm.models.Lead;
import com.xa.crmgena.crm.services.CustomerService;
import com.xa.crmgena.crm.services.LeadService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xa.crmgena.crm.models.Customer;
import com.xa.crmgena.crm.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/customers")
public class CustomerController {



        @Autowired
        CustomerRepository customerRepository;

        @Autowired
        CustomerService customerService;



        @GetMapping("/welcome")
        public String hello(){
            return "customers area";
        }


        @PostMapping
        public Customer createCustomer(@RequestBody CustomerDTO customerDTO) {
            Customer customer = new Customer();
            customerService.convertCustomerDTO(customerDTO, customer);
            return customerRepository.save(customer);
         }

        // Read
        @GetMapping("/")
        public List<Customer> getAllCustomers() {
            return customerRepository.findAll();
        }


        @GetMapping("/{id}")
        public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
            Optional<Customer> customer = customerRepository.findById(id);
            return customer.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }

        // Update
        @PutMapping("/{id}")
        public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer updatedCustomer) {
            Optional<Customer> existingCustomer = customerRepository.findById(id);
            if (existingCustomer.isPresent()) {
                updatedCustomer.setId(id);
                customerRepository.save(updatedCustomer);
                return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }

        // Delete
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
            if (customerRepository.existsById(id)) {
                customerRepository.deleteById(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
    }





