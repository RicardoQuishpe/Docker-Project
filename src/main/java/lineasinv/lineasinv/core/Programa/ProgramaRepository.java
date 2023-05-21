package lineasinv.lineasinv.core.Programa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProgramaRepository extends CrudRepository <Programa, Long>{
    /**
     * list for return 
     */
    List<Programa> findAll();
    
}
