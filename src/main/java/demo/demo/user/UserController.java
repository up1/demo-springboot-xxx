package demo.demo.user;

import demo.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable int userId) {
        return userRepository.getUserById(userId);
    }

    @PostMapping("/user/new")
    public User save(@RequestBody User user) {
        return new User(user.getFirstname() + "Called", user.getLastname());
    }

    @PostMapping("/user/new/list")
    public List<User> saveList(@RequestBody User user) {
        List<User> users = new ArrayList<>();
        users.add(new User("", ""));
        return users;
    }

}
