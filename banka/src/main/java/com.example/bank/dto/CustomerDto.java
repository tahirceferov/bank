package com.example.bank.banka.dto;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    @Id
    private String id;
    private String name;
    private Integer dateOfBirth;
    private CityDto city;
    private String address;
}
