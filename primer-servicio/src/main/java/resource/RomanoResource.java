package resource;


import errors.ResponseError;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import jakarta.ws.rs.core.Response;
import util.RomanoUtil;

@Path("/api/romano/{numero}")
public class RomanoResource {

    @Inject
    RomanoUtil util; //Inyecta la dependencia de RomanoUtil

    @GET
    public Response convertToRoman(@PathParam("numero") String numero){
        try {
            int num = Integer.parseInt(numero); //Validando que se coloquen números y no letras

            if(num == 0){ // en el caso remoto de que el número sea "0"
                return Response.ok().entity("N").build();
            }

           return Response.ok().entity(util.integerToRoman(num)).build(); //Me retorna el número en formato romano. Mediante el método integerToRoman(int) de RomanoUtil
        }
        catch (NumberFormatException e){
            return Response.status(400).entity(new ResponseError("No colocaste un número válido")).build(); //si se colocaron letras, me devuelve en objeto con la propiedad error y el mensaje
        }

    }
}
