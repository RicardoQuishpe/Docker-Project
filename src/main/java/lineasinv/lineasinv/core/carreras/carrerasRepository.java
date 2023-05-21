package lineasinv.lineasinv.core.carreras;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface carrerasRepository extends CrudRepository <carreras, Long>{
    List<carreras> findAll();
}
