package base_tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public void setUp() {
        System.out.println("Starting Our PetStore!");
        System.out.println("Welcome to the PetStore.");
    }

    @AfterClass
    public void teardown() {
        System.out.println("PetStore closed.");
        System.out.println("Thank you for visiting our PetStore!");

    }
}
