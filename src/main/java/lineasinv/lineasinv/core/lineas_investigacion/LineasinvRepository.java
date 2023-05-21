package lineasinv.lineasinv.core.lineas_investigacion;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LineasinvRepository extends CrudRepository <Lineasinv, Long> {

    List<Lineasinv> findAll();
    
}
