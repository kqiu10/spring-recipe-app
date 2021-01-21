package recipeapp.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import recipeapp.demo.domain.UnitOfMeasure;

import java.util.Optional;

/**
 * Date: 1/21/21
 * Question Description
 */

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);

}
