package lineasinv.lineasinv.core.authz.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import lineasinv.lineasinv.core.authz.entity.Role;




public interface RoleRepository extends CrudRepository <Role, Long> {

    List<Role> findAll();
    
}
