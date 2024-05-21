package petstore_client.pet.add_new_pet_to_store;

import petstore_entities.Category;
import petstore_entities.Tag;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AddNewPetRequestBody {
    public String name;
    public List<String> photoUrls;
    public int id;
    public Category category;
    public List<Map<String,Object>> tags;
    public String status;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Map<String, Object>> getTags() {
        return tags;
    }

    public void setTags(List<Map<String, Object>> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AddNewPetRequestBody{" +
                "name='" + name + '\'' +
                ", photoUrls=" + photoUrls +
                ", id=" + id +
                ", category=" + category +
                ", tags=" + tags +
                ", status='" + status + '\'' +
                '}';
    }
}
