package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.Author;
import guru.springframework.spring5webapp.Book;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;

//This is Run time class...this class is managed by Spring framework during runtime

//2)Implement ApplicationListener<ContectRefreshedEvent>
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    //4)Create object of interface Author and Book repositorhy
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    //5)Constructor Auto Injection
    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }
    //3)Create onApplicationEvent method and call init()
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        initData();
    }
    //1)
    private void initData(){

        //Eric
        Author eric = new Author("Eric","Evans");
        Book ddd= new Book("Domain Driven Design","1234","Harper Collins");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        //6)
        authorRepository.save(eric);
        bookRepository.save(ddd);

        //Rod
        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE Developement without EJB","23444","Worx");
        rod.getBooks().add(noEJB);

        //7)
        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }
}
