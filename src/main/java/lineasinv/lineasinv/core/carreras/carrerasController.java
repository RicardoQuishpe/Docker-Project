package lineasinv.lineasinv.core.carreras;

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
@RequestMapping("api/carrerasinv")
@CrossOrigin({"*"})
public class carrerasController {
    @Autowired 
    private carrerasService carrerasinvService;

    //CREAR

    @PostMapping("/")
    public carreras save (@RequestBody carreras entity){
        return carrerasinvService.save(entity);
    }

    @GetMapping ("/{id}/")
    public carreras findById(@PathVariable long id){
        return carrerasinvService.findById(id);
    }

    @GetMapping ("/")
    public List<carreras> findAll(){
        return carrerasinvService.findAll(); 
    }

    @PutMapping ("/")
    public carreras update(@RequestBody carreras entity){
        return carrerasinvService.save(entity);
    }
    
    @DeleteMapping ("/{id}/")
    public void deleteById(@PathVariable long id){
        carrerasinvService.deleteById(id);
    }
}
