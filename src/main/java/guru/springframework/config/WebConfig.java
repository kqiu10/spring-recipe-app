

package guru.springframework.config;

import guru.springframework.domain.Recipe;
import guru.springframework.services.RecipeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.ServerHttpResponse;

/**
 * Date: 1/27/21
 * Question Description
 *
 */
@Configuration
public class WebConfig {

  @Bean
  RouterFunction<?> routes(RecipeService recipeService) {
   return RouterFunctions.route(GET("/api/recipes"),
           serverRequest -> ServerHttpResponse
                   .ok()
                   .contentType(MediaType.APPLICATION.JSON)
                   .body(recipeService.getRecipes(), Recipe.class));

  }

}
