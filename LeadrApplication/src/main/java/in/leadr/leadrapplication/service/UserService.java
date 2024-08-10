package in.leadr.leadrapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.leadr.leadrapplication.model.User;
import in.leadr.leadrapplication.repo.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Create or Update
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Read by ID
    public User getUserById(Integer id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.orElse(null); // Return null if not found
    }

    // Read all
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Delete by ID
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }

    // Count all
    public long getUserCount() {
        return userRepository.count();
    }

	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
}
