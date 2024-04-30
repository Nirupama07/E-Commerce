package services;
import java.util.ArrayList;
import java.util.List;

import ecommerce.models.user;
import java.util.HashMap;
import java.util.Map;

public class LoginService {
    private Map<Long, User> users = new HashMap<>();
    private Long userIdCounter = 1L;

    public User register(User user) {
        user.setId(userIdCounter++);
        users.put(user.getId(), user);
        return user;
    }

    public User authenticate(String username, String password) {
        for (User user : users.values()) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public User getUserById(Long id) {
        return users.get(id);
    }
}

