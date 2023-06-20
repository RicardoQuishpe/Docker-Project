package lineasinv.lineasinv.core.Programa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Controlador Programa ", description = "Tabla programa")
@RestController
/**
 * Ruta de consulta "/api/programa/ or /api/programa//{id}/"
 */
@RequestMapping("/api/programa")
public class ProgramaController {
    @Autowired
    private ProgramaServices programaServices;

    /***
     * 
     * @param entity
     * @return
     */
    @Operation(summary = "Guarda un programa , Requiere Programa_Write") 
    @PreAuthorize("hasAuthority('Programa_Write')")
    @PostMapping("/")
    public Programa save(@RequestBody Programa entity){
        return programaServices.save(entity);
    }

    /**
     * 
     * @param id
     * @return
     */
    @Operation(summary = "Obtiene un programa por su id, Requiere Programa_Read") 
    @PreAuthorize("hasAuthority('Programa_Read')")
    @GetMapping("/{id}/")
    public Programa findById(@PathVariable Long id){
        return programaServices.findById(id);
    }

    /**
     * 
     * @param entity
     * @return
     */
    @Operation(summary = "Actualización de todos los valores de un programa a través de su ID, Requiere Programa_Update") 
    @PreAuthorize("hasAuthority('Programa_Update')")
    @PutMapping("/")
    public Programa update(@RequestBody Programa entity){
        return programaServices.save(entity);
    }

    /**
     * 
     * @param id
     */
    @Operation(summary = "Borra un programa a través de su ID, Requiere Programa_Delete") 
    @PreAuthorize("hasAuthority('Programa_Delete')")
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        programaServices.deleteById(id);
    }

    /***
     * 
     * @return
     */
    @Operation(summary = "Obtiene un listado de un programa, Requiere Programa_ReadAll") 
    @PreAuthorize("hasAuthority('Programa_ReadAll')")
    @GetMapping("/")
    public List<Programa> findAll(){
        return programaServices.findAll();
    }

}
