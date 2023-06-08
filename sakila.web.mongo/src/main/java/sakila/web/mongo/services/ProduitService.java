package sakila.web.mongo.services;

import sakila.web.mongo.entities.Produit;
import sakila.web.mongo.entities.User;

import java.util.List;

public interface ProduitService {

    Produit create(Produit produit);
    Produit read(Integer id);
    Produit update(Produit produit);
    void delete(Integer id);
    List<Produit> readAll();
}
