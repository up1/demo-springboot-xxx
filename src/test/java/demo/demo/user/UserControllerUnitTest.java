package demo.demo.user;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerUnitTest {

    @Mock
    private UserRepository userRepository;

    private UserController userController;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        userController = new UserController(userRepository);
    }

    @Test
    public void success_with_unit_test() {
        given(userRepository.getUserById(1))
                .willReturn(new User("Somkiat Mock", "Pui Mock"));

        User user = userController.getUser(1);

        assertEquals("Somkiat Mock", user.getFirstname());
        assertEquals("Pui Mock", user.getLastname());
    }

}