package lineasinv.lineasinv.core.Programa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @PostMapping("/")
    public Programa save(@RequestBody Programa entity){
        return programaServices.save(entity);
    }

    /**
     * 
     * @param id
     * @return
     */
    @GetMapping("/{id}/")
    public Programa findById(@PathVariable Long id){
        return programaServices.findById(id);
    }

    /**
     * 
     * @param entity
     * @return
     */
    @PutMapping("/")
    public Programa update(@RequestBody Programa entity){
        return programaServices.save(entity);
    }

    /**
     * 
     * @param id
     */
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        programaServices.deleteById(id);
    }

    /***
     * 
     * @return
     */
    @GetMapping("/")
    public List<Programa> findAll(){
        return programaServices.findAll();
    }

    @GetMapping ("/{id}/")
    public Programa findById(@PathVariable long id){
        return programaServices.findById(id);
    }
}
