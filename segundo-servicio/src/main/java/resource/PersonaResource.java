package resource;

import dto.PersonaDTO;
import dto.PersonaMapper;
import dto.ResponseDTO;
import errors.ResponseError;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.Persona;
import service.EdadRomano;


@Path("")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class PersonaResource {

    @Inject
    PersonaMapper mapper; //Convertirá los datos del modelo "Persona" al formato solicitado
    @POST
    public Response crearUsuario(@Valid Persona usuario) {
        int edad = usuario.calcularEdad();
        if (edad < 18 || edad > 50) {
            return Response.status(400).entity(new ResponseError("La edad debe estar entre 18 y 50 años.")).build();
        }
        PersonaDTO dto = mapper.createPersonaDTO(usuario); //Convierte los datos de Persona a PersonaDTO

        return Response.ok(new ResponseDTO(dto, "200")).build(); //Responda en la estructura con "dos campos" solicitada.

    }
}
