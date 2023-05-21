package lineasinv.lineasinv.core.Actividad;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ActividadRepository extends CrudRepository <Actividad, Long> {

    List<Actividad> findAll();
    }