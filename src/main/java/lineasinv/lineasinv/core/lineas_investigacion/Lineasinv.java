package lineasinv.lineasinv.core.lineas_investigacion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lineasinv.lineasinv.core.Programa.Programa;
import lombok.Data;

@Data
@Entity
public class Lineasinv {

    //Atributos 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String numero;
    private String nombre;
    private String encargado;
    private String estado;
    private String fecha_aprob;
    
    @ManyToOne 
    private Programa programa;
}