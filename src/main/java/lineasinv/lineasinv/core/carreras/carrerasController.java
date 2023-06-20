package lineasinv.lineasinv.core.carreras;

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

@Tag(name = "Controlador Carreras ", description = "Tabla carreras")
@RestController
@RequestMapping("api/carrerasinv")
@CrossOrigin({"*"})
public class carrerasController {
    @Autowired 
    private carrerasService carrerasinvService;

    //CREAR
    @Operation(summary = "Guarda una carrera , Requiere Carreras_Write") 
    @PreAuthorize("hasAuthority('Carreras_Write')")
    @PostMapping("/")
    public carreras save (@RequestBody carreras entity){
        return carrerasinvService.save(entity);
    }
    @Operation(summary = "Obtiene una carrera por su id, Requiere Carreras_Read") 
    @PreAuthorize("hasAuthority('Carreras_Read')")
    @GetMapping ("/{id}/")
    public carreras findById(@PathVariable long id){
        return carrerasinvService.findById(id);
    }

    @Operation(summary = "Obtiene un listado de las carreras, Requiere Carreras_ReadAll") 
    @PreAuthorize("hasAuthority('Carreras_ReadAll')")
    @GetMapping ("/")
    public List<carreras> findAll(){
        return carrerasinvService.findAll(); 
    }

    @Operation(summary = "Actualización de todos los valores de una carrera a través de su ID, Requiere Carreras_Update") 
    @PreAuthorize("hasAuthority('Carreras_Update')")
    @PutMapping ("/")
    public carreras update(@RequestBody carreras entity){
        return carrerasinvService.save(entity);
    }
    
    @Operation(summary = "Borra una carrera a través de su ID, Requiere Carreras_Delete") 
    @PreAuthorize("hasAuthority('Carreras_Delete')")
    @DeleteMapping ("/{id}/")
    public void deleteById(@PathVariable long id){
        carrerasinvService.deleteById(id);
    }
}
