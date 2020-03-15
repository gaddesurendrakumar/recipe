package gadde.springframework.recipe.services;

import gadde.springframework.recipe.commands.RecipeCommand;
import gadde.springframework.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    public Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    RecipeCommand findCommandById(Long l);
    void deleteById(Long idToDelete);
}
