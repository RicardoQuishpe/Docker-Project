package lineasinv.lineasinv.core.lineas_investigacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
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



@Tag(name = "Controlador Lineas de Investigacion ", description = "Tabla lineas de investigacion")
@RestController
@RequestMapping("api/lineasinv")
@CrossOrigin({"*"})
public class LineasinvController {

    @Autowired 
    private LineasinvService lineasinvService;

    //CREAR

    @Operation(summary = "Guarda las lineas de investigacion , Requiere Lineasinv_Write") 
    @PreAuthorize("hasAuthority('Lineasinv_Write')")
    @PostMapping("/")
    public Lineasinv save (@RequestBody Lineasinv entity){
        return lineasinvService.save(entity);
    }

    //Obtener por ID

    @Operation(summary = "Obtiene una linea de investigación por su id, Requiere Lineasinv_Read") 
    @PreAuthorize("hasAuthority('Lineasinv_Read')")
    @GetMapping ("/{id}/")
    public Lineasinv findById(@PathVariable long id){
        return lineasinvService.findById(id);
    }

    //Obtener Todo

    @Operation(summary = "Obtiene un listado de las lineas de investigación, Requiere Lineasinv_ReadAll") 
    @PreAuthorize("hasAuthority('Lineasinv_ReadAll')")
    @GetMapping ("/")
    public List<Lineasinv> findAll(){
        return lineasinvService.findAll(); 
    }

    //Actualizar

    @Operation(summary = "Actualización de todos los valores de una linea de investigación a través de su ID, Requiere Lineasinv_Update") 
    @PreAuthorize("hasAuthority('Lineasinv_Update')")
    @PutMapping ("/")
    public Lineasinv update(@RequestBody Lineasinv entity){
        return lineasinvService.save(entity);
    }
    //Eliminar

    @Operation(summary = "Borra una linea de investigación a través de su ID, Requiere Lineasinv_Delete") 
    @PreAuthorize("hasAuthority('Lineasinv_Delete')")
    @DeleteMapping ("/{id}/")
    public void deleteById(@PathVariable long id){
        lineasinvService.deleteById(id);
    }
}
