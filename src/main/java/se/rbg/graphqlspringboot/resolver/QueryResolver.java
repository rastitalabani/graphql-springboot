package se.rbg.graphqlspringboot.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import se.rbg.graphqlspringboot.domain.Author;
import se.rbg.graphqlspringboot.domain.Book;
import se.rbg.graphqlspringboot.service.AuthorService;
import se.rbg.graphqlspringboot.service.BookService;

import java.util.Collections;
import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {
  private final AuthorService authorService;
  private final BookService bookService;

  public QueryResolver(AuthorService authorService, BookService bookService) {
    this.authorService = authorService;
    this.bookService = bookService;
  }

  public List<Author> getAuthors() {
    return Collections.singletonList(authorService.getAuthor());
  }
  public List<Book> getBooks(int authorId) {
    return Collections.singletonList(bookService.getBook());
  }

}
