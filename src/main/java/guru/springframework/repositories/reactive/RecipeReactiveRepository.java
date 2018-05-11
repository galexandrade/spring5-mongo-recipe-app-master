package guru.springframework.repositories.reactive;

import guru.springframework.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by alex.andrade on 11/05/2018.
 */
public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String> {
}
