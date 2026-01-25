import config.BaseTest;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TesteTerceiraApi extends BaseTest{

    @Test
    public void apiPathParameters (){
        String pathParameter = "testecomsucesso";
        String endPoint = "/api/primeiraApiV2/"+pathParameter;

        given()
                .log().all()
                .when()
                .get(endPoint)
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .body(containsString(pathParameter));
    }
}
