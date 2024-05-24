package petstore_client.pet.update_existing_pet;

import petstore_entities.Category;
import petstore_entities.Tag;

import java.util.List;

public class Request {
    public String name;
    public List<String> photoUrls;
    public int id;
    public Category category;
    public List<Tag> tags;
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

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
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
        return "Request{" +
                "name='" + name + '\'' +
                ", photoUrls=" + photoUrls +
                ", id=" + id +
                ", category=" + category +
                ", tags=" + tags +
                ", status='" + status + '\'' +
                '}';
    }
}
