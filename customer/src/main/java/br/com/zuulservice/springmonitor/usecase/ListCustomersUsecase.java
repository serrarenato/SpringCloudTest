package br.com.zuulservice.springmonitor.usecase;

import java.util.List;

import br.com.zuulservice.springmonitor.controller.CustomerController;
import br.com.zuulservice.springmonitor.gateway.CustomerGateway;
import br.com.zuulservice.springmonitor.gateway.impl.CustomerHardCoreGateway;
import br.com.zuulservice.springmonitor.gateway.impl.repository.Entity.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ListCustomersUsecase {


   final static Logger logger = LoggerFactory.getLogger(ListCustomersUsecase.class);

   @Autowired
   //@Qualifier("customerHardCoreGateway")
   @Qualifier("customerPostgreeGateway")
   CustomerGateway customerGateway;

   public List<Customer> findAll() {
      logger.info("method findAll");
      return customerGateway.findAll();
   }
}
