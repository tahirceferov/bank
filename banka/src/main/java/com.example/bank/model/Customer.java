package com.example.bank.banka.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity

data class Customer {
    @Id
    private String id;
    private String name;
    private Integer dateOfBirth;
    private City city;
    private String address;
}
