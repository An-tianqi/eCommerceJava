package sakila.web.mongo.services;

import sakila.web.mongo.entities.Panier;
import sakila.web.mongo.entities.Produit;

public interface PanierService {

    Panier createPanier(Panier panier);

    Panier getPanierById(Integer panierId);

    void addToPanier(Integer panierId, Integer produitId);

    void removeFromPanier(Integer panierId, Integer produitId);

    void clearPanier(Integer panierId);
}
