
package org.portfolio.dca.Security.Service;

import org.portfolio.dca.Security.Entity.Rol;
import org.portfolio.dca.Security.Enums.RolNombre;
import org.portfolio.dca.Security.Repository.IRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
       irolRepository.save(rol);
    }
}
