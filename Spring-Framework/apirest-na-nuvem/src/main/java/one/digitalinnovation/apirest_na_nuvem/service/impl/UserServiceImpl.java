package one.digitalinnovation.apirest_na_nuvem.service.impl;

import one.digitalinnovation.apirest_na_nuvem.domain.model.User;
import one.digitalinnovation.apirest_na_nuvem.domain.repository.UserRepository;
import one.digitalinnovation.apirest_na_nuvem.service.UserService;
import org.springframework.stereotype.Service;


import java.util.NoSuchElementException;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return this.userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
                throw new IllegalArgumentException("This Account Number already exists!");
        }
        return  userRepository.save(userToCreate);
    }
}
