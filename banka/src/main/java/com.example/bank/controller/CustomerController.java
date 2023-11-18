package com.example.bank.banka.controller;

import com.example.bank.banka.dto.CustomerDto;
import com.example.bank.banka.request.customer.CustomerCreateRequest;
import com.example.bank.banka.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
//    @GetMapping
//    public ResponseEntity<List<CustomerDto>> getAllCustomer(){
//        return ResponseEntity.ok(customerService.getAllCustomer());
//    }
    @PostMapping()
    public ResponseEntity<CustomerDto> createCustomerDto(@RequestBody CustomerCreateRequest request){
        return ResponseEntity.ok(customerService.createCustomerDto(request));
    }
}
