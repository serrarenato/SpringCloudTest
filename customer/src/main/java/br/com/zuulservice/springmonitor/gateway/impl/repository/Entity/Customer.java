package br.com.zuulservice.springmonitor.gateway.impl.repository.Entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "type", length = 1, discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue("P")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Customer implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idCustomer;
   private String name;
   @Column(insertable=false, updatable=false)
   private String type;
}
