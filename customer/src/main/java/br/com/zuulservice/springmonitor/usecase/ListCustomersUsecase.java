package br.com.zuulservice.springmonitor.usecase;

import java.util.List;

import br.com.zuulservice.springmonitor.gateway.CustomerGateway;
import br.com.zuulservice.springmonitor.gateway.impl.CustomerHardCoreGateway;
import br.com.zuulservice.springmonitor.gateway.impl.repository.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ListCustomersUsecase {

   @Autowired
   @Qualifier("customerHardCoreGateway")
   CustomerGateway customerGateway;

   public List<Customer> findAll() {
      return customerGateway.findAll();
   }
}
