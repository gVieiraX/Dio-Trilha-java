package one.digitalinnovation.apirest_na_nuvem.service;

import one.digitalinnovation.apirest_na_nuvem.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
