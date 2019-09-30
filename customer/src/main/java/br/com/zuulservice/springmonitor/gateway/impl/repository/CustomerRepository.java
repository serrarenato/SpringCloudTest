package br.com.zuulservice.springmonitor.gateway.impl.repository;

import br.com.zuulservice.springmonitor.gateway.impl.repository.Entity.Customer;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository extends JpaRepositoriesAutoConfiguration<Customer, Long> {

}
