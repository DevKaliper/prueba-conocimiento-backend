package dto;

import jakarta.enterprise.context.ApplicationScoped;
import model.Persona;


public interface PersonaMapper {
    //Recibe los datos del modelo Persona y los transforma al modelo PersonaDTO
    PersonaDTO createPersonaDTO (Persona p);

}
