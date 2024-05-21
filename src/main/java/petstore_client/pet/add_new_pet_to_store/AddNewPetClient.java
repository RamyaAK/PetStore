package petstore_client.pet.add_new_pet_to_store;

import io.restassured.response.Response;
import properties.API_Properties;

import static io.restassured.RestAssured.given;

public class AddNewPetClient {

    public AddNewPetResponseBody adding_new_pet_to_store(AddNewPetRequestBody requestBody) {

        String url = String.format("%s/pet", API_Properties.baseURL);
        System.out.println(url);
        System.out.println(requestBody.toString());

        Response response = given()
                .contentType("application/json")
                .body(requestBody)
                .when()
                .post(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        AddNewPetResponseBody addNewPetResponseBody = response.as(AddNewPetResponseBody.class);
        addNewPetResponseBody.setHttpStatusCode(response.getStatusCode());
        return addNewPetResponseBody;
    }
}
