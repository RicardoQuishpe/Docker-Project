package lineasinv.lineasinv.core.lineas_investigacion;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lineasinv.lineasinv.core.Programa.Programa;
import lombok.Data;

@Data
@Entity
public class Lineasinv {

    //Atributos @
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String numero;
    private String nombre;
    private String encargado;
    private String estado;
    private String fechaAprob;
    
    @ManyToOne 
    private Programa programa;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "lineas_act_id")
    private List<Actividades> actividad = new ArrayList<>();
}