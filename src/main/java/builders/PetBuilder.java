package builders;

import petstore_client.pet.add_new_pet_to_store.AddNewPetRequestBody;
import petstore_entities.Category;
import petstore_entities.Tag;
import utils.RestUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PetBuilder {
    AddNewPetRequestBody addNewPetRequestBody;
    RestUtils restUtils = new RestUtils();
    Category category;

    CategoryBuilder categoryBuilder;
    List<Map<String,Object>> tag;
    TagBuilder tagBuilder;

    public PetBuilder(){
        addNewPetRequestBody = new AddNewPetRequestBody();

        categoryBuilder = new CategoryBuilder();
        tagBuilder = new TagBuilder();
        tag = new TagBuilder().build();

        addNewPetRequestBody.setName(restUtils.getPet_name());
        addNewPetRequestBody.setPhotoUrls(Arrays.asList("in occaecat","mollit ullamco et dolore nisi"));
        addNewPetRequestBody.setId(restUtils.getId());
        addNewPetRequestBody.setCategory(categoryBuilder.build());
        addNewPetRequestBody.setTags(tag);
        addNewPetRequestBody.setStatus("pending");
    }
}
