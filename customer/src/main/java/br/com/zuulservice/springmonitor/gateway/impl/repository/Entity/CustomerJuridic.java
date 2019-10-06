package br.com.zuulservice.springmonitor.gateway.impl.repository.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@DiscriminatorValue(value = "J")
@Data
@EqualsAndHashCode
public class CustomerJuridic extends Customer{
   private String cnpj;
}
