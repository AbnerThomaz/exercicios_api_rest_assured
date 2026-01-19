import io.restassured.RestAssured;
import org.hamcrest.Matchers;

public class TesteQuartaApi {
    public void apiComRegrasImparPar(){
        String url = "http://localhost:8080/exercicios/parOuImpar?numero=1";

        RestAssured.given()
                .log().all()
                .when()
                .get(url)
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .body(Matchers.containsString("O numero 1 é impar"));
    }
}
