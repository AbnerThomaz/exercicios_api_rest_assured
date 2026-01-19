import io.restassured.RestAssured;
import org.hamcrest.Matchers;

public class TesteSegundaApi {

    public void apiQueryParameter(){
        String url = "http://localhost:8080/api/primeiraApiV1?palavra=Teste com Sucesso";

        RestAssured.given()
                .log().all()
                .when()
                .get(url)
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .body(Matchers.containsString("Teste com Sucesso"));
    }
}

