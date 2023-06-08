package sakila.web.mongo.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sakila.web.mongo.entities.User;
import sakila.web.mongo.repositories.UserRepository;

import java.util.List;

@Service
    @Slf4j
        @AllArgsConstructor
public class UserServiceImpl implements UserService{

    private UserRepository repository;

    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public User read(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<User> readAll() {
        return repository.findAll();
    }
}
