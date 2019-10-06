package br.com.zuulservice.springmonitor.controller;

import java.util.List;

import javax.validation.Valid;

import br.com.zuulservice.springmonitor.controller.objects.CustomerFisicRequest;
import br.com.zuulservice.springmonitor.controller.objects.CustomerFisicResponse;
import br.com.zuulservice.springmonitor.gateway.impl.repository.Entity.Customer;
import br.com.zuulservice.springmonitor.gateway.impl.repository.Entity.CustomerFisic;
import br.com.zuulservice.springmonitor.usecase.CreateCustomersUsecase;
import br.com.zuulservice.springmonitor.usecase.ListCustomersUsecase;
import br.com.zuulservice.springmonitor.usecase.convert.MapperCustomerToCustomerFisicResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

   final static Logger logger = LoggerFactory.getLogger(CustomerController.class);

   @Autowired
   ListCustomersUsecase listCustomersUsecase;

   @Autowired
   CreateCustomersUsecase createCustomersUsecase;

   @Autowired
   MapperCustomerToCustomerFisicResponse mapperCustomerToCustomerFisicResponse;

   @GetMapping
   //TODO: Usar um mapper para converter o objeto ao response
   public List<Customer> findAll() {
      return listCustomersUsecase.findAll();
   }

   @PostMapping
   public CustomerFisicResponse createCustomer(@RequestBody @Valid CustomerFisicRequest c) {
      logger.info("Method createCustomer Request: "+ c);
      CustomerFisic customer = createCustomersUsecase.createCustomer(c);
      CustomerFisicResponse response = mapperCustomerToCustomerFisicResponse.convert(customer);
      logger.info("Method createCustomer Response: "+ response);
      return response;
   }

}
