package lineasinv.lineasinv.core.lineas_investigacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/lineasinv")
@CrossOrigin({"*"})
public class LineasinvController {

    @Autowired 
    private LineasinvService lineasinvService;

    //CREAR

    @PostMapping("/")
    public Lineasinv save (@RequestBody Lineasinv entity){
        return lineasinvService.save(entity);
    }

    @GetMapping ("/{id}/")
    public Lineasinv findById(@PathVariable long id){
        return lineasinvService.findById(id);
    }

    @GetMapping ("/")
    public List<Lineasinv> findAll(){
        return lineasinvService.findAll(); 
    }

    @PutMapping ("/")
    public Lineasinv update(@RequestBody Lineasinv entity){
        return lineasinvService.save(entity);
    }
    
    @DeleteMapping ("/{id}/")
    public void deleteById(@PathVariable long id){
        lineasinvService.deleteById(id);
    }
}
