package lineasinv.lineasinv.core.lineas_investigacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LineasinvService {

    @Autowired
    private LineasinvRepository lineasinvRepository;

    //CRUD

    //CREAR
    public Lineasinv save (Lineasinv entity){
        return lineasinvRepository.save(entity);
    }
    
    //READ 
    public Lineasinv findById(long id){
        return lineasinvRepository.findById(id).orElse(null);
    }

    public void deleteById(long id){
        lineasinvRepository.deleteById(id);
    }

    public List<Lineasinv> findAll(){
        return lineasinvRepository.findAll();
    }

}