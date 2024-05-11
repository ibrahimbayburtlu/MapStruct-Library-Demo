package com.ibrahimbayburtlu.MapStructLibrary.repository;

import com.ibrahimbayburtlu.MapStructLibrary.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
