package se.rbg.graphqlspringboot.service;

import org.springframework.stereotype.Service;
import se.rbg.graphqlspringboot.domain.Book;

@Service
public class BookService {
  public Book getBook() {
    return Book.builder()
      .id(1)
      .tittle("book1")
      .build();
  }
}
