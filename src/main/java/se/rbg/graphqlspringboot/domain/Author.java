package se.rbg.graphqlspringboot.domain;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class Author {
  private int id;
  private String name;
  private List<Book> books;
}
