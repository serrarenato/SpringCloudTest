package br.com.zuulservice.springmonitor.gateway.impl.repository;

import br.com.zuulservice.springmonitor.gateway.impl.repository.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
