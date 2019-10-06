package br.com.zuulservice.springmonitor.usecase.convert;

import br.com.zuulservice.springmonitor.controller.objects.CustomerFisicRequest;
import br.com.zuulservice.springmonitor.controller.objects.CustomerFisicResponse;
import br.com.zuulservice.springmonitor.gateway.impl.repository.Entity.Customer;
import br.com.zuulservice.springmonitor.gateway.impl.repository.Entity.CustomerFisic;
import org.springframework.stereotype.Service;

@Service
public class MapperCustomerToCustomerFisicResponse {
   //TODO: Create a mapper
   public CustomerFisicResponse convert(CustomerFisic customerFisic) {
      return  CustomerFisicResponse.builder().cpf(customerFisic.getCpf()).name(customerFisic.getName()).id(customerFisic.getIdCustomer()).build();
   }
}
