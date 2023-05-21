package lineasinv.lineasinv.core.Programa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramaServices {
   @Autowired
    private ProgramaRepository programaRepository;

    /*
     * CRUD -> inyection of repository
     */
      /**
       * 
       * @param entity
       * @return
      */
     public Programa save(Programa entity){
        return programaRepository.save(entity);
     }
     /**
      * 
      * @param id
      * @return
     */
     public Programa findById(Long id){
        return programaRepository.findById(id).orElse(null);
     }
     /**
      * @param id
      * VOID no return
      */
     public void deleteById(Long id){
        programaRepository.deleteById(id);
     }
     /**
      * 
      * @return
      */
     public List<Programa> findAll(){
        return programaRepository.findAll();
     }
}
