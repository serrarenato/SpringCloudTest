package br.com.zuulservice.springmonitor.controller.objects;

import javax.validation.constraints.NotNull;

import lombok.*;

@Data
@EqualsAndHashCode
@Builder
@ToString
public class CustomerFisicRequest {
   @NotNull
   private String name;
   @NotNull
   private String cpf;
   public CustomerFisicRequest(String name, String cpf){
      this.name = name;
      this.cpf= cpf;
   }

}
