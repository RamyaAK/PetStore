package utils;

import lombok.Getter;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;

public class RestUtils {
    String generatedString = RandomStringUtils.randomAlphabetic(1);
    int generatedInteger = Integer.parseInt(RandomStringUtils.randomNumeric(1));

    @Getter
    int tagId;
    @Getter
    String tagName;

    @Getter
    String pet_name;
    @Getter
    List<String> photoUrls;
    @Getter
    int id;
    @Getter
    String category;
    @Getter
    String status;


    public void setTagId(String tagId) {
        this.tagId = 1+generatedInteger;
    }

    public void setTagName(String tagName) {
        this.tagName = "J"+generatedString;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = "Jaadu"+generatedString;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
