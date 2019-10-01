package br.com.zuulservice.springmonitor.controller;

import java.util.List;

import br.com.zuulservice.springmonitor.gateway.impl.repository.Entity.Customer;
import br.com.zuulservice.springmonitor.usecase.ListCustomersUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
   @Autowired
   ListCustomersUsecase listCustomersUsecase;

   @GetMapping
   public List<Customer> findAll() {
      return listCustomersUsecase.findAll();
   }

}
