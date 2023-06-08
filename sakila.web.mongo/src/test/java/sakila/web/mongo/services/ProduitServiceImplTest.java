package sakila.web.mongo.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sakila.web.mongo.entities.Produit;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class ProduitServiceImplTest {

    @Autowired
    ProduitService service;
    @Test
    void create() {
        Produit produit = new Produit(null,"Iphone",988.0,"telephone");
        service.create(produit);
        log.trace("{}",produit);
    }

    @Test
    void read() {
        Produit produit = service.read(2);
        log.trace("{}",produit);
    }

    @Test
    void update() {
        Produit produit = service.read(2);
        produit.setId(3);
        produit.setName("Mac pro");
        produit.setPrix(2100.0);
        produit.setDescription("Ordinateur");
        service.update(produit);
        log.trace("{}",produit);
    }

    @Test
    void delete() {
        service.delete(3);
    }

    @Test
    void readAll() {
        service.readAll().forEach(u->log.trace("{}",u));
    }
}