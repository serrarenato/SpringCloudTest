package br.com.zuulservice.springmonitor.usecase;

import java.util.List;

import br.com.zuulservice.springmonitor.gateway.CustomerGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListCustomersUsecase {
   @Autowired
   CustomerGateway customerGateway;

   public List<String> findAll() {
      return customerGateway.findAll();
   }
}
