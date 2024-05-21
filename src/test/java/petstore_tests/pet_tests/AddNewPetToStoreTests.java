package petstore_tests.pet_tests;

import base_tests.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddNewPetToStoreTests extends BaseTest {

    @BeforeTest
    public void initialSteps(){
      // prepare Test Data or request Payload for testing
    }

    @Test
    public void addNewPetToStoreTest(){


    }

    @AfterTest
    public void closeTest(){
        System.out.println("Closing the Test!");
    }

}
