package guru.springframework.spring5webapp.repositories;
//BookRepository.java
import guru.springframework.spring5webapp.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
