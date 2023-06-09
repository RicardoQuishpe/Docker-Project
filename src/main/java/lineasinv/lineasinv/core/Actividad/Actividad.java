package lineasinv.lineasinv.core.Actividad;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

    @Data  
    @Entity
    public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String fechaInicio;
    private String fechaFinal;
    private String detalle;
    }