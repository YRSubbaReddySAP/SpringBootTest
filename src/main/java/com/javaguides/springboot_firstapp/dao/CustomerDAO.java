package com.javaguides.springboot_firstapp.dao;
import com.javaguides.springboot_firstapp.service.CustomerService;
import com.javaguides.springboot_firstapp.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer> {

   @Override
   List<Customer> findAll();
}
