package config;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

import static io.restassured.RestAssured.given;

public class BaseTest {

    @BeforeClass
    public static void setup() {

        String baseUrl = System.getenv("API_BASE_URL");
        String token = System.getenv("API_TOKEN");

        if (baseUrl == null || baseUrl.isEmpty()) {
            throw new RuntimeException("API_BASE_URL não foi definida.");
        }

        RestAssured.baseURI = baseUrl;

        if (token != null && !token.isEmpty()) {
            RestAssured.requestSpecification = given()
                    .header("Authorization", "Bearer " + token)
                    .contentType("application/json");
        }
    }
}

