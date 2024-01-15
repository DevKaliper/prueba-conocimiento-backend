import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import util.RomanoUtil;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
public class TestRomanoResource {


    @InjectMock
    RomanoUtil util;

    @Test
    public void testRomanConversionEndpoint() {
       //Testeando que cuando le pase 25 me responda con un 200, y convierta a su equivalente en número romano
        Mockito.when(util.integerToRoman(25)).thenReturn("XXV");


       given()
                .pathParam("numero", "25") //Cuando se le pasa por parámetro el numero 25
                .when().get("/api/romano/{numero}")//Al Endpoint expuesto
                .then() //Me va a retornar
                .statusCode(200)//El código de estado 200
                .body(equalTo("XXV")); //Y en su body el string "XXV"
    }

    @Test
    public void testRomanConversionEndpoint0() {
        //Testeando que cuando le pase 0 me responda con un 200, y convierta a su equivalente en número romano
        Mockito.when(util.integerToRoman(0)).thenReturn("N");

        given()
                .pathParam("numero", "0")
                .when().get("/api/romano/{numero}")
                .then()
                .statusCode(200)
                .body(equalTo("N"));
    }


    @Test
    public void testRomanConversionEndpointStringGiven() {
        //Testeando que cuando le pase un string me responda con un 400 bad Request
        given()
                .pathParam("numero", "0s2ws")
                .when().get("/api/romano/{numero}")
                .then()
                .statusCode(400);

    }

}
