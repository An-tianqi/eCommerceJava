package sakila.web.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import sakila.web.mongo.entities.Produit;

public interface ProduitRepository extends MongoRepository<Produit,Integer> {
}
