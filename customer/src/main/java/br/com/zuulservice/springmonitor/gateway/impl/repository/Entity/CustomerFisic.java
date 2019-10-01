package br.com.zuulservice.springmonitor.gateway.impl.repository.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
///@DiscriminatorValue(value = "F")
@Data
@EqualsAndHashCode
public class CustomerFisic extends Customer{

      private String cpf;

}
