package br.com.zuulservice.springmonitor.gateway.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.zuulservice.springmonitor.gateway.CustomerGateway;
import br.com.zuulservice.springmonitor.gateway.impl.repository.Entity.Customer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("customerHardCoreGateway")
public class CustomerHardCoreGateway implements CustomerGateway {


   public List<Customer> findAll() {
      return dummyCustomers();
   }

   private List<Customer> dummyCustomers() {
      List<Customer> list = new ArrayList<>();
      Customer c1 = new Customer(1L,"Customer 1", "P");
      Customer c2 = new Customer(2L,"Customer 2", "P");
      Customer c3 = new Customer(3L,"Customer 3", "P");
      Customer c4 = new Customer(4L,"Customer 4", "P");
      list.add(c1);
      list.add(c2);
      list.add(c3);
      list.add(c4);
      return list;
   }

}
