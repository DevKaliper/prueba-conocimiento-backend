package service;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@ApplicationScoped
@Path("/romano")
@RegisterRestClient(configKey="romanoNumero-api")
public interface EdadRomano {

    //Realizará una solicitud HTTP GET a la dirección "http://localhost:8080/api/romano/{numero}" (primer micro-servicio)
    //La función obtenerEdadRomano devolverá la respuesta del primer micro-servicio (La edad en número romano)
    @GET
    @Path("/{numero}")
    String obtenerEdadEnRomano(@PathParam("numero") int edad);

}
