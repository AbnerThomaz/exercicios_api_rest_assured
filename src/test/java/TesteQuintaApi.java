import config.BaseTest;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TesteQuintaApi extends BaseTest {

    @Test
    public void apiComRegrasImparPar(){
        String endPoint = "/exercicios/parOuImpar?numero=1";

        given()
                .log().all()
                .when()
                .get(endPoint)
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .body(containsString("O numero 1 é impar"));
    }
}
