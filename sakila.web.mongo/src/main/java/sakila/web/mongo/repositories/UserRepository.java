package sakila.web.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sakila.web.mongo.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
}
