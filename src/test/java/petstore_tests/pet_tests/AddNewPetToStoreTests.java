package petstore_tests.pet_tests;

import base_tests.BaseTest;
import builders.PetBuilder;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import petstore_client.pet.add_new_pet_to_store.AddNewPetClient;
import petstore_client.pet.add_new_pet_to_store.AddNewPetRequestBody;
import petstore_client.pet.add_new_pet_to_store.AddNewPetResponseBody;
import petstore_entities.Pet;

public class AddNewPetToStoreTests extends BaseTest {

    //class objects initializations and variables declaration section
    Pet pet = new Pet();
    AddNewPetRequestBody addNewPetRequestBody = new AddNewPetRequestBody();
    AddNewPetResponseBody addNewPetResponseBody = new AddNewPetResponseBody();

    @BeforeTest
    public void initialSteps() {
        // prepare Test Data or request Payload for testing
        addNewPetRequestBody = new PetBuilder().build();
        System.out.println(addNewPetRequestBody.toString());
    }

    @Test
    public void addNewPetToStoreTest() {
        addNewPetResponseBody = new AddNewPetClient().adding_new_pet_to_store(addNewPetRequestBody);
        Assert.assertEquals(addNewPetResponseBody.getHttpStatusCode(),200);
        Assert.assertNotNull(addNewPetResponseBody.getId());
        Assert.assertEquals(addNewPetResponseBody.getCategory().getId(),2);
        Assert.assertEquals(addNewPetResponseBody.getCategory().getName(),"jaadu");
        Assert.assertEquals(addNewPetResponseBody.getName(),"Jaadu");
        Assert.assertEquals(addNewPetResponseBody.getPhotoUrls().get(0),"in occaecat");
        Assert.assertEquals(addNewPetResponseBody.getPhotoUrls().get(1),"mollit ullamco et dolore nisi");
        Assert.assertEquals(addNewPetResponseBody.getTags().get(0).getId(),addNewPetRequestBody.getTags().get(0).get("id"));
        Assert.assertEquals(addNewPetResponseBody.getTags().get(0).getName(),addNewPetRequestBody.getTags().get(0).get("name"));
        Assert.assertEquals(addNewPetResponseBody.getTags().get(1).getId(),addNewPetRequestBody.getTags().get(1).get("id"));
        Assert.assertEquals(addNewPetResponseBody.getTags().get(1).getName(),addNewPetRequestBody.getTags().get(1).get("name"));
        Assert.assertEquals(addNewPetResponseBody.getStatus(),"pending");
    }

    @AfterTest
    public void closeTest() {
        System.out.println("Closing the Test!");
    }

}
