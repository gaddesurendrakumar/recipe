package gadde.springframework.recipe.services;

import gadde.springframework.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    public Set<Recipe> getRecipes();
    Recipe findById(Long l);

}
