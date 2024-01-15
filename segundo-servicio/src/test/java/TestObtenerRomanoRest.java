import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import service.EdadRomano;

@QuarkusTest
public class TestObtenerRomanoRest {
    @RestClient
    @Inject
    @InjectMock
    EdadRomano edadRomanoService;

    @Test
    public void testObtenerEdadEnRomano() {
        //Mockeo edadRomanoService para que siempre que llame a su metodo "obtenerEdadEnRomano" con cualquier número, me devuelva "XVIII"
        Mockito.when(edadRomanoService.obtenerEdadEnRomano(Mockito.anyInt())).thenReturn("XVIII");

        // Simulamos la llamada y verificamos el resultado esperado
        String edadRomana = edadRomanoService.obtenerEdadEnRomano(18);
        Assertions.assertEquals("XVIII", edadRomana, "La edad en romano debe ser XVIII");

        // Verifica que el mock fue llamado correctamente
        Mockito.verify(edadRomanoService).obtenerEdadEnRomano(18);

    }
}
