
package org.portfolio.dca.Interface;

import org.portfolio.dca.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer una lista de persona
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar usuario por id
    public void deletePersona(Long id);
    
    //buscar una persona por id
    public Persona findPersona(Long id);
}
