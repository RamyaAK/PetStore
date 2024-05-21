package petstore_client.pet.add_new_pet_to_store;

import petstore_entities.Category;
import petstore_entities.Tag;

import java.util.ArrayList;

public class AddNewPetResponseBody {
    public long id;
    public Category category;
    public String name;
    public ArrayList<String> photoUrls;
    public ArrayList<Tag> tags;
    public String status;
}
