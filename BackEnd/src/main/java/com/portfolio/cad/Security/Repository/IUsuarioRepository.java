
package com.portfolio.cad.Security.Repository;

import com.portfolio.cad.Security.Entity.Usuario;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
    //Metodo para poder buscar un usuario mediante su nombre
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    
    //Método para verificar si un usuario existe en nuestra base de datos
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);
}
