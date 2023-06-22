package com.portfolio.cad.Security.Repository;

import com.portfolio.cad.Security.Entity.Rol;
import com.portfolio.cad.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {

    //Método para buscar un rol por su nombre en nuestra base de datos
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
