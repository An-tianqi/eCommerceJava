package sakila.web.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sakila.web.mongo.entities.Panier;

@Repository
public interface PanierRepository  extends MongoRepository<Panier, Integer> {
}
