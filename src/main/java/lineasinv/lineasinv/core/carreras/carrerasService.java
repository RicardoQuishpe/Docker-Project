package lineasinv.lineasinv.core.carreras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class carrerasService {
    @Autowired
    private carrerasRepository carrerasinvRepository;

    //CRUD

    //CREAR
    public carreras save (carreras entity){
        return carrerasinvRepository.save(entity);
    }
    
    //READ 
    public carreras findById(long id){
        return carrerasinvRepository.findById(id).orElse(null);
    }

    public void deleteById(long id){
        carrerasinvRepository.deleteById(id);
    }

    public List<carreras> findAll(){
        return carrerasinvRepository.findAll();
    }
}
