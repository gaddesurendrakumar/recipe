package gadde.springframework.recipe.services;

import gadde.springframework.recipe.domain.Recipe;
import gadde.springframework.recipe.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
//import static org.junit.jupiter.api.Assertions.;

class RecipesServiceImplTest {

    RecipesServiceImpl recipesService;
    @Mock
    RecipeRepository recipeRepository;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        recipesService = new RecipesServiceImpl(recipeRepository);
    }

    @Test
    void getRecipes() {

        Recipe recipe = new Recipe();
        HashSet recHashSet = new HashSet();
        recHashSet.add(recipe);
        when(recipeRepository.findAll()).thenReturn(recHashSet);
        Set<Recipe> recipes = recipesService.getRecipes();
        assertEquals(recipes.size(),1);
        verify(recipeRepository,times(1)).findAll();
    }
}