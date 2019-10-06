package br.com.zuulservice.springmonitor.usecase;

import java.util.List;

import br.com.zuulservice.springmonitor.controller.objects.CustomerFisicRequest;
import br.com.zuulservice.springmonitor.gateway.CustomerGateway;
import br.com.zuulservice.springmonitor.gateway.impl.repository.Entity.Customer;
import br.com.zuulservice.springmonitor.gateway.impl.repository.Entity.CustomerFisic;
import br.com.zuulservice.springmonitor.usecase.convert.MapperCustomerFisicRequestToCustomer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CreateCustomersUsecase {

   final static Logger logger = LoggerFactory.getLogger(CreateCustomersUsecase.class);

   @Autowired
   @Qualifier("customerPostgreeGateway")
   CustomerGateway customerGateway;

   MapperCustomerFisicRequestToCustomer mapper;

   @Autowired
   public CreateCustomersUsecase(MapperCustomerFisicRequestToCustomer mapper) {
      this.mapper = mapper;
   }

   public CustomerFisic createCustomer(CustomerFisicRequest customerFisic) {
      logger.info("createCustomer request: ", customerFisic);
      //Todo: do a mapper converter to customer
      CustomerFisic customer = mapper.convert(customerFisic);
      CustomerFisic response = (CustomerFisic) customerGateway.createCustomer(customer);
      logger.info("createCustomer response: ", response);
      return response;
   }
}
