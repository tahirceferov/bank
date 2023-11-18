package com.example.bank.banka.request.customer;

import com.example.bank.banka.model.City;
import lombok.Data;

@Data
public class CustomerBaseRequest {

    private String name;
    private Integer dateOfBirth;
    private City city;
    private String address;
}
