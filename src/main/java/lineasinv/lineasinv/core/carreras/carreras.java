package lineasinv.lineasinv.core.carreras;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class carreras {
     //Atributos 
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;
     private String nombreCarrera;
     private String coordinador;
     private String semestres;
}
