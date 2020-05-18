package se.rbg.graphqlspringboot;

import com.oembedler.moon.graphql.boot.GraphQLWebAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = GraphQLWebAutoConfiguration.class)
public class GraphqlSpringBootApplication {

  public static void main(String[] args) {
    SpringApplication.run(GraphqlSpringBootApplication.class, args);
  }
}
