package demo.demo.user;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@JdbcTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

//    @After
//    public void clear() {
//        userRepository.deleteAll();
//    }

    @Test
    public void getUserById() {
        User user =  userRepository.getUserById(1);
        assertEquals("Somkiat Test", user.getFirstname());
        assertEquals("Pui Test", user.getLastname());
    }

    @Test
    public void not_found() {
        User user =  userRepository.getUserById(2);
        assertNull(user);
    }
}