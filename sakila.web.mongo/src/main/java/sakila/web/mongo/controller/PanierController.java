package sakila.web.mongo.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sakila.web.mongo.entities.Panier;
import sakila.web.mongo.entities.Produit;
import sakila.web.mongo.entities.User;
import sakila.web.mongo.services.PanierService;

import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
@Slf4j
@RequestMapping("/panier")
public class PanierController {

    private PanierService service;

    @GetMapping("/show")
    public String showPanierForm(){

        return "/panier.html"; // Retourne le nom de la template (signup.html)
    }
    @PostMapping("/create")
    public String ajouterPanier(@ModelAttribute("produit") Panier panier,
                                @RequestParam("produitId") Integer produitId,
                                @RequestParam("produitNom") String produitNom,
                                @RequestParam("produitPrix") Double produitPrix) {
        Produit produit = new Produit();
        produit.setId(produitId);
        produit.setName(produitNom);
        produit.setPrix(produitPrix);
        List<Produit> produits = new ArrayList<Produit>();
        produits.add(produit);
        panier.setId(produitId);
        panier.setProduits(produits);
        service.createPanier(panier);

        return "/resulta.html"; // L'URL de la page de bienvenue après la création du compte
    }


}
