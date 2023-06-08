package sakila.web.mongo.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sakila.web.mongo.entities.User;
import sakila.web.mongo.services.UserService;
import java.util.List;

@Controller
@RequestMapping("/user")
@Slf4j
@AllArgsConstructor
public class UserController {
    private UserService service;

    /*@GetMapping({"/", "/all"})
    public List<User> getAll() {
        return service.readAll();
    }
    @PostMapping("/create")
    public User create(@RequestBody User user){
        log.trace("User create -->{}",user);
        return service.create(user);
    }*/

    @GetMapping("/signup")
    public String showSignUpForm(){

        return "/signup.html"; // Retourne le nom de la template (signup.html)
    }

    @PostMapping("/signup")
    public String signUpUser(@ModelAttribute("user") User user) {
        service.create(user);
        return "/resulta.html"; // L'URL de la page de bienvenue après la création du compte
    }


}