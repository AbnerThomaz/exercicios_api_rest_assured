import io.restassured.RestAssured;
import org.hamcrest.Matchers;

public class TesteTerceiraApi {
    public void apiPathParameters (){
        String url = "http://localhost:8080/api/primeiraApiV2/testecomsucesso";

        RestAssured.given()
                .log().all()
                .when()
                .get(url)
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .body(Matchers.containsString("testecomsucesso"));
    }
}
