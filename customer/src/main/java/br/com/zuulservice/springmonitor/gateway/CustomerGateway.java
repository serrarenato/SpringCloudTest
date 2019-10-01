package br.com.zuulservice.springmonitor.gateway;

import java.util.List;

import br.com.zuulservice.springmonitor.gateway.impl.repository.Entity.Customer;

public interface CustomerGateway {
   List<Customer> findAll();
}
