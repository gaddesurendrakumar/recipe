package gadde.springframework.recipe.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CategoryTest {

    Category category;
    @BeforeEach
    void setUp() {
    category = new Category();
    }

    @Test
    void getId() {
        Long idValue = 8L;
        category.setId(idValue);
        assertEquals(idValue,category.getId());
    }

    @Test
    void getDescription() {
        String myDescription = "Catagory test";
        category.setDescription(myDescription);
        assertEquals(myDescription,category.getDescription());

    }


}