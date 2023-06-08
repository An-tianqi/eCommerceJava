package sakila.web.mongo.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@AllArgsConstructor
public class CheckController {


    @GetMapping("/")
    public String check(){
        String msg="<p><a href='produit/all'>Produits</a></p>";
        msg+="<p><a href='user/signup'>Creer un compte</a></p>";
        msg+="<p><a href='swagger-ui/index.html'>Voici une documentation pour Mr Nacef</a></p>";
        msg+="</div>" ;
        return msg;
    }
}
