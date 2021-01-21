package recipeapp.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import recipeapp.demo.domain.Recipe;

import java.util.Optional;

/**
 * Date: 1/21/21
 * Question Description
 */

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

    Optional<Recipe> findByDescription(String description);
}
