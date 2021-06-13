package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.repository.CustomerRepository;
import com.codegym.service.CustomerService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/customers/", method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> listAllCustomers() {
        List<Customer> customers = customerService.findAll();
        if (customers.isEmpty()) {
            return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
    }
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") int id){
        System.out.println("Fetching customer wiht id:"+ id);
        Customer customer= customerService.findById(id);
        if (customer==null){
            System.out.println("Customer with id"+id+"not found");
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Customer>(customer,HttpStatus.OK);
    }
    @RequestMapping(value = "/customers/", method = RequestMethod.POST)
    public ResponseEntity<Void> createCustomer(@RequestBody Customer customer, UriComponentsBuilder builder){
        System.out.println("Creating customer:"+ customer.getLastName());
        customerService.save(customer);
        HttpHeaders headers= new HttpHeaders();
        headers.setLocation(builder.path("/customers/{id}").buildAndExpand(customer.getId()).toUri());
        return new ResponseEntity<Void>(headers,HttpStatus.CREATED);
    }
    @RequestMapping(value = "/customers/{id}",method = RequestMethod.PUT)
    public ResponseEntity<Customer> updateCustomer(@PathVariable("id")int id,@RequestBody Customer customer){
        System.out.println("updating customer:"+id);
        Customer customer1= customerService.findById(id);

        if (customer1==null){
            System.out.println("Customer wiht id"+id+"not found");
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        customer1.setFirstName(customer.getFirstName());
        customer1.setLastName(customer.getLastName());
        customer1.setId(customer.getId());
        customerService.save(customer1);
        return new ResponseEntity<Customer>(customer1,HttpStatus.OK);
    }
    @RequestMapping(value = "/customers/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Customer> deleteCustomer(@PathVariable("id")int id,Customer customer){
        System.out.println("Fetching and deleting customer with id"+id);
        Customer customer2= customerService.findById(id);

        if (customer2==null){
            System.out.println("Customer wiht id"+id+"not found");
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        customerService.delete(id);
        return new ResponseEntity<Customer>(customer2,HttpStatus.NO_CONTENT);
    }
}
