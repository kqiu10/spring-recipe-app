package recipeapp.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import recipeapp.demo.domain.Category;

import java.util.Optional;

/**
 * Date: 1/21/21
 * Question Description
 */

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
