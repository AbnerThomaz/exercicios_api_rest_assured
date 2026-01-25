import config.BaseTest;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestePrimeiraApi extends BaseTest {

    @Test
    public void testeComSucessoPrimeiraApi() {

        given()
                .log().all()
                .when()
                .get("/api/primeiraApi")
                .then()
                .log().all()
                .statusCode(200)
                .body(containsString("Retorno da api com sucesso!!!"));
    }
}

