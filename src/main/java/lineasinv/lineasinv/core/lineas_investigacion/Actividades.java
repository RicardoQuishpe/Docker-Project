package lineasinv.lineasinv.core.lineas_investigacion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lineasinv.lineasinv.core.Actividad.Actividad;
import lombok.Data;

@Data
@Entity
public class Actividades {

    //Atributos 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @ManyToOne
    private Actividad actividad;
   
}
