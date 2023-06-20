package lineasinv.lineasinv.core.Programa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lineasinv.lineasinv.core.carreras.carreras;
import lombok.Data;

@Data
@Entity
public class Procarreras {

    //Atributos 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private carreras carreras;
   
}