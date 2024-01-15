package dto;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import model.Persona;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import service.EdadRomano;

@ApplicationScoped
public class PersonaMapperImpl implements PersonaMapper {  //Implemento La funcionalidad createPersonaDTO


    @RestClient
    @Inject
    EdadRomano edadEnRomano; //Aquí se solicitará el número en romano en formato romano. Función del primero micro-servicio

    @Override
    public PersonaDTO createPersonaDTO(Persona p) {
        //Agarra los datos del modelo "Persona" y los transforma al modelo PersonaDTO
        PersonaDTO persona = new PersonaDTO();
        persona.setEdad("Su edad es: " + p.calcularEdad() + " años.");
        persona.setNombre(p.getNombre() + " " + p.getApellido());
        persona.setRomano("Su edad en número romano es: " + edadEnRomano.obtenerEdadEnRomano(p.calcularEdad()));
        return persona;

    }
}
