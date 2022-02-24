package com.courseBookingSystem.courseBookingSystem.repositories;


import com.courseBookingSystem.courseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findCustomersByBookingsCourseName (String name);

    List<Customer> findCustomersByHometownAndBookingsCourseName(String town, String course);

}
