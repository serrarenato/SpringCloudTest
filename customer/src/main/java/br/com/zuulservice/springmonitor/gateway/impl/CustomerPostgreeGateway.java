package br.com.zuulservice.springmonitor.gateway.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.zuulservice.springmonitor.gateway.CustomerGateway;
import org.springframework.stereotype.Service;

@Service
public class CustomerPostgreeGateway implements CustomerGateway {
   private static final String CUSTOMERS[] ={
           "Customer 1",
           "Customer 2",
           "Customer 3",
           "Customer 4"};

   public List<String> findAll() {
      return new ArrayList<String>(Arrays.asList(CUSTOMERS));
   }

}
