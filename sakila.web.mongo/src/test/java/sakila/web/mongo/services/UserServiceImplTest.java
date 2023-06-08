package sakila.web.mongo.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sakila.web.mongo.entities.User;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
    @Slf4j
class UserServiceImplTest {

    @Autowired
    UserService service;

    @Test
    void create() {
        User user = new User(null, "Marine","TESTS");
        service.create(user);
        log.trace("{}",user);
    }

    @Test
    void read() {
    }

    @Test
    void readAll() {
        service.readAll().forEach(u->log.trace("{}",u));
    }
}