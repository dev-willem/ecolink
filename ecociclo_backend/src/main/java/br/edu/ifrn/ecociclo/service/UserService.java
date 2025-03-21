package br.edu.ifrn.ecociclo.service;

import br.edu.ifrn.ecociclo.model.User;
import br.edu.ifrn.ecociclo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }

//    public void signUp(String username, String password, String email, String CpfCnpj) {
//        User user = new User();
//        user.setUsername(username);
//        user.setPasswordHash(password);
//        user.setEmail(email);
//        user.setCpfCnpj(CpfCnpj);
//        repository.save(user);
//    }

    private void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

}
