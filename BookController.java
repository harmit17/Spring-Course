package guru.springframework.spring5webapp.controllers;

//Configuring Spring MVC controller
import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller                             //Register Class as a Spring Bean and Controller in Spring MVC
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")                          //Associating with book path(invokes when request comes in with /books (http://localhost:8080/books))
    public String getBooks(Model model){            //Model which is interface will pass at a runtime, Controller Method is invoked

        model.addAttribute("books",bookRepository.findAll());//this will tell Spring Data JPA to go out and get list of books from the db

        return "books"; //this will tell spring mvc that thhis is a view called books
    }   //Spring MVC associate that list as a model(POJOs) passed to view
}
