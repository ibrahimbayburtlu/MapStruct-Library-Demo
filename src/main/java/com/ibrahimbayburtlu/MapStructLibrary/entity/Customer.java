package com.ibrahimbayburtlu.MapStructLibrary.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "customer_name")
    private String name;

    @Column(name = "customer_email")
    private String email;

    @Column(name = "customer_phone_number")
    private String phoneNumber;

    @Column(name = "customer_status")
    private Long customerStatus;
}
