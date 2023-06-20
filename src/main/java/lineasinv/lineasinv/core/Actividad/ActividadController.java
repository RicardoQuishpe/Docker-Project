package lineasinv.lineasinv.core.Actividad;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Controlador Actividad ", description = "Tabla actividad")
@RestController
@RequestMapping("api/actividad")
@CrossOrigin("*")
public class ActividadController {

    @Autowired
    private ActividadService actividadService;

    // crear
    // metod delimitador de acceso,tipo de dato que retorna,nombre del
    // metodo/funcion
    @Operation(summary = "Guarda una actividad , Requiere Actividad_Write") 
    @PreAuthorize("hasAuthority('Actividad_Write')")
    @PostMapping("/crear")
    public Actividad save(@RequestBody Actividad entity) {
        return actividadService.save(entity);
    }

    // traer por id
    @Operation(summary = "Obtiene una actividad por su id, Requiere Actividad_Read") 
    @PreAuthorize("hasAuthority('Actividad_Read')")
    @GetMapping("/listar/{id}")
    public Actividad findById(@PathVariable long id) {
        return actividadService.findById(id);
    }

    // traer todo
    @Operation(summary = "Obtiene un listado de las actividades, Requiere Actividad_ReadAll") 
    @PreAuthorize("hasAuthority('Actividad_ReadAll')")
    @GetMapping("/listar")
    public List<Actividad> findAll() {
        return actividadService.findAll();
    }

    // actualizar
    @Operation(summary = "Actualización de todos los valores de una actividad a través de su ID, Requiere Actividad_Update") 
    @PreAuthorize("hasAuthority('Actividad_Update')")
    @PutMapping("/actualizar")
    public Actividad update(@RequestBody Actividad entity) {
        return actividadService.save(entity);
    }

    // actualizar parcial
    @PatchMapping("/actualizar/{id}")
    public Actividad partialUpdate(@PathVariable long id, @RequestBody Map<String, Object> fields) {
        Actividad actividad = findById(id);
        for (Map.Entry<String, Object> field : fields.entrySet()) {
            String fieldName = field.getKey();
            Object fieldValue = field.getValue();
            try {
                Field campoEntidad = Actividad.class.getDeclaredField(fieldName);
                campoEntidad.setAccessible(true);
                campoEntidad.set(actividad, fieldValue);
            } catch (NoSuchFieldException | IllegalAccessException ex) {
                
            }
        }
        return update(actividad);
    }

    // eliminar
    @Operation(summary = "Borra una actividad a través de su ID, Requiere Actividad_Delete") 
    @PreAuthorize("hasAuthority('Actividad_Delete')")
    @DeleteMapping("/eliminar/{id}")
    public void deleteById(@PathVariable long id) {
        actividadService.deleteById(id);
    }

}