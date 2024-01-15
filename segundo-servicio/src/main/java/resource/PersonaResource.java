package resource;

import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.Persona;


@Path("")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class PersonaResource {
    @POST
    public Response crearUsuario(@Valid Persona usuario) {
        int edad = usuario.calcularEdad();
        if (edad < 18 || edad > 50) {
            return Response.status(Response.Status.BAD_REQUEST).entity("La edad debe estar entre 18 y 50 años.").build();
        }

        // Aquí iría la lógica para persistir el usuario, si fuese necesario.

        return Response.ok(usuario).build();

    }
}
