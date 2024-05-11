package com.ibrahimbayburtlu.MapStructLibrary.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String name;

    private String email = "default@gmail.com";

    private String phoneNumber;

    private Long customerStatus;
}
