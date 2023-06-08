package sakila.web.mongo.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sakila.web.mongo.entities.Produit;
import sakila.web.mongo.services.ProduitService;

import java.util.List;

@Controller
@AllArgsConstructor
@Slf4j
@RequestMapping("/produit")
public class ProduitController {

    private ProduitService service;

    @GetMapping(value = "/{id}")
    public Produit getProduit(@PathVariable Integer id){
        log.trace("get picture for id :{}",id);
        return service.read(id);
    }

    @GetMapping("/all")
    public String getAll(Model model){
        List<Produit> produits = service.readAll();
        model.addAttribute("produits", produits);
        return "/List.html";
    }
    /*@GetMapping("/all")
    public ModelAndView getAll(){

        List<Produit> produits = service.readAll();
        ModelAndView mv = new ModelAndView("List.html");
        mv.addObject("produits",produits);
        return mv;
    }*/

    @PostMapping("/create")
    public Produit create(@RequestBody Produit produit){
        log.trace("Create Staff :{}",produit);
        return service.create(produit);
    }

    @PutMapping("/update/{id}")
    public Produit updateProduit(@PathVariable Integer id, @RequestBody Produit produit){
        log.trace("update to Produit id:{}",id);
        var produit1 = service.read(id);
        if ( produit1 == null  )
            return null;
        else {
            produit1.setName(produit.getName());
            produit1.setPrix(produit.getPrix());
            produit1.setDescription(produit.getDescription());
            return service.update(produit1);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduit(@PathVariable Integer id){
        service.delete(id);
    }
}