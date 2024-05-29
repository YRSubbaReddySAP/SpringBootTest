package com.javaguides.springboot_firstapp.service;

import com.javaguides.springboot_firstapp.dao.CustomerDAO;
import com.javaguides.springboot_firstapp.exception.CustomerNotFoundException;
import com.javaguides.springboot_firstapp.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {
    private int customerIdCount = 1;
    @Autowired
    private CustomerDAO customerDAO;
    private List<Customer> customerList;

    {
        customerList = new CopyOnWriteArrayList<>();
    }

    public  Customer addCustomer(Customer customer)
    {
       // customer.setCustomerId(customerIdCount);
        //customerList.add(customer);
      //  customerlist.add(Customer);
        //customerIdCount++;
        //return customer;
        return customerDAO.save(customer);

    }
    public List<Customer> getCustomers(){
        //return customerList;
        return customerDAO.findAll();
    }
    public Customer getCustomer(int CustomerId){
      //  Customer customer1 = customerList.stream().filter(c -> c.getCustomerId() == CustomerId).findFirst().get();
//        Customer customer1 = new Customer();
//        customer1.setCustomerFirstName("Hello");
//        customer1.setCustomerLastName("bye");
//        customer1.setCustomerEmail("hello@bye.com");
//        customer1.setCustomerId(CustomerId);
     //   return customer1;

        //return customerDAO.findById(CustomerId).get();

        Optional<Customer> optionalCustomer = customerDAO.findById(CustomerId);
        if (!optionalCustomer.isPresent()) {
            throw new CustomerNotFoundException("Customer Not Found");
        }

                return optionalCustomer.get();
    }
    public Customer updateCustomer(int customerId, Customer customer){
        customer.setCustomerId(customerId);
//        customerList.stream().forEach(c -> {
//            if (c.getCustomerId() == customerId) {
//                c.setCustomerFirstName(customer.getCustomerFirstName());
//                c.setCustomerLastName(customer.getCustomerLastName());
//                c.setCustomerEmail(customer.getCustomerEmail());
//            }
//        });
//        Customer customer1 = customerList.stream().filter(c -> c.getCustomerId() == customerId).findFirst().get();
//        return customer1;
        return customerDAO.save(customer);
    }
    public void deleteCustomer(int customerID)
    {
//        customerList.stream().forEach( c-> {
//            if (c.getCustomerId() == customerID) {
//            customerList.remove(c);
//            }
//        });
        customerDAO.deleteById(customerID);
    }
}
