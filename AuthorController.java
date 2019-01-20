package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;//auto wired in author repository

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")//For URl http://localhost:8080/authors
    public String getAuthors(Model model){  //passing in the Model through Spring MVC

        model.addAttribute("authors",authorRepository.findAll());//appending attribute authors which is gonna be list of authors

        return "authors";//return string authors to specify a viewname we want thymeleaf to render
    }
}
