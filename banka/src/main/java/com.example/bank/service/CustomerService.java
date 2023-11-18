package com.example.bank.banka.service;

import com.example.bank.banka.convert.CustomerDtoConverter;
import com.example.bank.banka.dto.CustomerDto;
import com.example.bank.banka.model.City;
import com.example.bank.banka.model.Customer;
import com.example.bank.banka.repository.CustomerRepository;
import com.example.bank.banka.request.customer.CustomerCreateRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerDtoConverter customerDtoConverter;
    private final Customer customer;


    public CustomerService(CustomerRepository customerRepository, CustomerDtoConverter customerDtoConverter, Customer customer) {
        this.customerRepository = customerRepository;
        this.customerDtoConverter = customerDtoConverter;

        this.customer = customer;
    }

//    public List<CustomerDto> getAllCustomer() {
//        List<Customer> customerList = customerRepository.findAll();
//
//        List<CustomerDto> customerDtoList = new ArrayList<>();
//        for (Customer customer : customerList) {
//            customerDtoList.add(customerDtoConverter.convert(customer));
//        }
//        return customerDtoList;
//    }

    public CustomerDto createCustomerDto(CustomerCreateRequest request) {
        Customer customer = Customer.builder()
                .name(request.getName())
                .dateOfBirth(request.getDateOfBirth())
                .address(request.getAddress())
                .city(City.valueOf(request.getCity().name()))
                .build();

        return customerDtoConverter.convert(customerRepository.save(customer));


    }
}
