package sakila.web.mongo.services;

import sakila.web.mongo.entities.User;

import java.util.List;

public interface UserService {
    User create(User user);
    User read(String id);
    List<User> readAll();

}
