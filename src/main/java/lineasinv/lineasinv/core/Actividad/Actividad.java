package lineasinv.lineasinv.core.Actividad;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lineasinv.lineasinv.core.Programa.Programa;
import lombok.Data;

    @Data  
    @Entity
    public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String Nombre;
    private LocalDate Fecha_inicio;
    private LocalDate Fecha_final;
    private String Detalle;

    @ManyToOne
    private Programa programa;
    }