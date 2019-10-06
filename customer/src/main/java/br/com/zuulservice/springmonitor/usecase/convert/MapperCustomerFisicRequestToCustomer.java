package br.com.zuulservice.springmonitor.usecase.convert;

import br.com.zuulservice.springmonitor.controller.objects.CustomerFisicRequest;
import br.com.zuulservice.springmonitor.gateway.impl.repository.Entity.Customer;
import br.com.zuulservice.springmonitor.gateway.impl.repository.Entity.CustomerFisic;
import org.springframework.stereotype.Service;


@Service
public class MapperCustomerFisicRequestToCustomer {
   //TODO: Create a mapper
   public CustomerFisic convert(CustomerFisicRequest customerFisic) {
      return  CustomerFisic.builder().cpf(customerFisic.getCpf()).name(customerFisic.getName()).type("F").build();
   }
}
