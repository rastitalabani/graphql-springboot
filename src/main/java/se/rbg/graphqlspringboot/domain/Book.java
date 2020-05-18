package se.rbg.graphqlspringboot.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Book {
  private int id;
  private String tittle;
  private int authorId;
}
