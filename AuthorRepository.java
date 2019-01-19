package guru.springframework.spring5webapp.repositories;
//AuthorRepository.java
import guru.springframework.spring5webapp.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {


}
