package br.com.zuulservice.springmonitor.gateway.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.zuulservice.springmonitor.gateway.CustomerGateway;
import br.com.zuulservice.springmonitor.gateway.impl.repository.CustomerRepository;
import br.com.zuulservice.springmonitor.gateway.impl.repository.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerPostgreeGateway implements CustomerGateway {
   @Autowired
   CustomerRepository customerRepository;
   public List<Customer> findAll() {
      List<Customer> listCustomers = customerRepository.findAll();
      return listCustomers;
   }

   @Override
   public Customer createCustomer(Customer c){
      return customerRepository.save(c);
   }

}
