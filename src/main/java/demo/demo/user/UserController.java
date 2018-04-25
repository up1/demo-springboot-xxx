package demo.demo.user;

import demo.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable int userId) {
        return userRepository.getUserById(userId);
    }

    @PostMapping("/user/new")
    public User save(@RequestBody User user) {
        return new User(user.getFirstname() + "Called", user.getLastname());
    }

}
