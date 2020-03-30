package be.uantwerpen.fti.se.tutorial.Service;

import be.uantwerpen.fti.se.tutorial.Model.User;
import be.uantwerpen.fti.se.tutorial.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> findAll() {
        return (List<User>) this.userRepository.findAll();
    }
    public void save(final User user) {
        this.userRepository.add(user);
    }
}
