package builders;

import petstore_entities.Category;

public class CategoryBuilder {
    Category category;

    public CategoryBuilder() {
        category = new Category();

        category.setId(2);
        category.setName("jaadu");
    }

    public Category build() {
        return category;
    }
}
