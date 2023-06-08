package sakila.web.mongo.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sakila.web.mongo.entities.Panier;
import sakila.web.mongo.entities.Produit;
import sakila.web.mongo.repositories.PanierRepository;
import sakila.web.mongo.repositories.ProduitRepository;

@Service
@Slf4j
@AllArgsConstructor
public class PanierServiceImpl implements  PanierService{

    private PanierRepository panierRepository;
    private ProduitRepository productRepository;

    @Override
    public Panier createPanier(Panier panier) {
        return panierRepository.save(panier);
    }

    @Override
    public Panier getPanierById(Integer panierId) {
        return panierRepository.findById(panierId).orElse(null);
    }

    @Override
    public void addToPanier(Integer panierId, Integer produitId) {
        Panier panier = panierRepository.findById(panierId).orElse(null);
        Produit produit = productRepository.findById(produitId).orElse(null);
        if (panier != null && produit != null) {
            panier.getProduits().add(produit);
            panierRepository.save(panier);
        }
    }

    @Override
    public void removeFromPanier(Integer panierId, Integer produitId) {
        Panier panier = panierRepository.findById(panierId).orElse(null);
        if (panier != null) {
            panier.getProduits().remove(produitId);
            panierRepository.save(panier);
        }
    }

    @Override
    public void clearPanier(Integer panierId) {
        Panier panier = panierRepository.findById(panierId).orElse(null);
        if (panier != null) {
            panier.getProduits().clear();
            panierRepository.save(panier);
        }
    }



}