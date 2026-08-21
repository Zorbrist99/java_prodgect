package HomeWork17;

import HomeWork17.models.Usuario;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ServeRestTest extends TestBase {
    private static String userId;
    private static String emailUser;
    private static String tokenAuth;

    @Test
    void shouldGetAllUsers() {
        given()
                .when()
                .get("/usuarios")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("quantidade", greaterThan(0))
                .body("usuarios[0]", not(empty()))
                .log().body()
                .extract().response();
    }

    @Test
    void shouldFindUserByEmail() {
        String userEmail = given()
                .when()
                .get("/usuarios")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("quantidade", greaterThan(0))
                .body("usuarios[0]", not(empty()))
                .extract().path("usuarios[0].email");

        given()
                .when()
                .queryParam("email", userEmail)
                .log().uri()
                .get("/usuarios")
                .then()
                .statusCode(200)
                .body("quantidade", is(1))
                .body("usuarios[0].email", equalTo(userEmail))
                .log().body();
    }

    @Test
    void shouldCreateNewUser() {
        emailUser = "spy_%s@qa.com".formatted(String.valueOf(System.currentTimeMillis()));
        System.out.printf("Сохранение emailUser выполнено успешно: %s%n", emailUser);

        String body = """
                {
                  "nome": "Тайный Покупатель",
                  "email": "%s",
                  "password": "secret123",
                  "administrador": "true"
                }
                """.formatted(emailUser);

        Response response = given()
                .contentType(ContentType.JSON)
                .body(body)
                .log().uri()
                .log().body()
                .when()
                .post("/usuarios")
                .then()
                .statusCode(201)
                .body("message", equalTo("Cadastro realizado com sucesso"))
                .body("_id", not(empty()))
                .log().body()
                .extract().response();

        userId = response.path("_id");
        System.out.printf("Сохранение userId выполнено успешно: %s%n", userId);
    }

    @Test
    void shouldUpdateUser() {
        shouldCreateNewUser();

        String body = """
                {
                  "nome": "Обновлённый Покупатель",
                  "email": "%s",
                  "password": "secret123",
                  "administrador": "false"
                }
                """.formatted(emailUser);

        given()
                .contentType(ContentType.JSON)
                .pathParam("userId", userId)
                .body(body)
                .log().uri()
                .when()
                .put("/usuarios/{userId}")
                .then()
                .log().body()
                .statusCode(200)
                .body("message", equalTo("Registro alterado com sucesso"));
    }

    @Test
    void shouldLogin() {
        shouldCreateNewUser();
        String body = """
                {
                "email": "%s",
                "password": "secret123"
                }
                """.formatted(emailUser);

        Response response = given()
                .contentType(ContentType.JSON)
                .body(body)
                .log().uri()
                .log().body()
                .when()
                .post("/login")
                .then()
                .log().body()
                .statusCode(200)
                .body("message", equalTo("Login realizado com sucesso"))
                .extract().response();

        tokenAuth = response.path("authorization");
        System.out.printf("Токен авторизации успешно сохранен: %s", tokenAuth);
    }

    @Test
    void shouldDeleteUser() {
        shouldLogin();

        given()
                .header("Authorization", tokenAuth)
                .pathParam("userId", userId)
                .when()
                .delete("/usuarios/{userId}")
                .then()
                .log().body()
                .statusCode(200)
                .body("message", equalTo("Registro excluído com sucesso"));

        given()
                .pathParam("userId", userId)
                .log().uri()
                .when()
                .get("/usuarios/{userId}")
                .then()
                .statusCode(400)
                .log().body();
    }

    @Test
    void shouldGetAllProducts() {
        given()
                .log().uri()
                .when()
                .get("/produtos")
                .then()
                .log().body()
                .statusCode(200)
                .body("quantidade", greaterThan(0))
                .body("produtos[0].nome", equalTo("Produto QA 1787307791648_qeus7"))
                .body("produtos.preco", everyItem(greaterThan(0)))
                .body("produtos.nome", not(empty()));
    }

    @Test
    @DisplayName("★ Создание пользователя через DTO (сериализация)")
    void shouldCreateUserFromDto() {
        emailUser = "spy_%s@qa.com".formatted(String.valueOf(System.currentTimeMillis()));
        Usuario usuario = new Usuario("Тайный Покупатель", emailUser, "secret123", "true");

        Response response = given()
                .contentType(ContentType.JSON)
                .body(usuario)
                .log().uri()
                .log().body()
                .when()
                .post("/usuarios")
                .then()
                .statusCode(201)
                .body("message", equalTo("Cadastro realizado com sucesso"))
                .body("_id", not(empty()))
                .log().body()
                .extract().response();

        userId = response.path("_id");
        System.out.printf("Сохранение userId выполнено успешно: %s%n", userId);
    }
}
