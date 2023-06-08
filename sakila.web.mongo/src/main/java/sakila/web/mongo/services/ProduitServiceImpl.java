package sakila.web.mongo.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sakila.web.mongo.entities.Produit;
import sakila.web.mongo.repositories.ProduitRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ProduitServiceImpl implements ProduitService{

    private ProduitRepository repository;

    @Override
    public Produit create(Produit produit) {
        return repository.save(produit);
    }

    @Override
    public Produit read(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Produit update(Produit produit) {
        return repository.save(produit);
    }

    @Override
    public void delete(Integer id) { repository.deleteById(id); }

    @Override
    public List<Produit> readAll() {
        return repository.findAll();
    }

}
