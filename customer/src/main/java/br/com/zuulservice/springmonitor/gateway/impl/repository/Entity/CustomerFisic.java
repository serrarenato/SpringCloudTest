package br.com.zuulservice.springmonitor.gateway.impl.repository.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.*;

@Entity
@DiscriminatorValue(value = "F")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString
@NoArgsConstructor
public class CustomerFisic extends Customer {

   private String cpf;

   @Builder
   public CustomerFisic(String cpf, String name, String type) {

      super(null, name, type);
      this.cpf = cpf;
   }

}
