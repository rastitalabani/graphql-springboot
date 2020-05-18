package se.rbg.graphqlspringboot.service;

import org.springframework.stereotype.Service;
import se.rbg.graphqlspringboot.domain.Author;
import se.rbg.graphqlspringboot.domain.Book;

import java.util.Collections;

@Service
public class AuthorService {
  public Author getAuthor() {
    Book book = Book.builder()
      .id(1)
      .tittle("book1")
      .build();

    return Author.builder()
      .id(1)
      .name("Author1")
      .books(Collections.singletonList(book))
      .build();
  }
}
