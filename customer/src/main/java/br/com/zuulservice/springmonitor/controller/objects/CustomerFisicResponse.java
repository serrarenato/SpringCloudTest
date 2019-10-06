package br.com.zuulservice.springmonitor.controller.objects;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@Builder
@ToString
public class CustomerFisicResponse {

   private String name;
   private String cpf;
   private Long id;

}
