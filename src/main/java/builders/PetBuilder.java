package builders;

import petstore_client.pet.add_new_pet_to_store.AddNewPetRequestBody;
import petstore_entities.Category;
import utils.RestUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PetBuilder {
    AddNewPetRequestBody addNewPetRequestBody;
    RestUtils restUtils = new RestUtils();
    Category category;

    CategoryBuilder categoryBuilder;
    List<Map<String, Object>> tag;
    TagBuilder tagBuilder;

    public PetBuilder() {
        addNewPetRequestBody = new AddNewPetRequestBody();

        categoryBuilder = new CategoryBuilder();
        category = categoryBuilder.build();

        tagBuilder = new TagBuilder();
        tag = new TagBuilder().build();

        addNewPetRequestBody.setName("Jaadu");
        addNewPetRequestBody.setPhotoUrls(Arrays.asList("in occaecat", "mollit ullamco et dolore nisi"));
        addNewPetRequestBody.setId(-93576091);
        addNewPetRequestBody.setCategory(category);
        addNewPetRequestBody.setTags(tag);
        addNewPetRequestBody.setStatus("pending");
    }

    public AddNewPetRequestBody build() {
        return addNewPetRequestBody;
    }
}
