package com.example.bank.banka.convert;

import com.example.bank.banka.dto.CityDto;
import com.example.bank.banka.dto.CustomerDto;
import com.example.bank.banka.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {
    public CustomerDto convert(Customer customer){
          CustomerDto customerDto = CustomerDto.builder()
                  .id(customer.getId())
                  .name(customer.getName())
                  .dateOfBirth(customer.getDateOfBirth())
                  .city(CityDto.valueOf(customer.getCity().name()))
                  .address(customer.getAddress())
                  .build();
          return customerDto;
    }
}
