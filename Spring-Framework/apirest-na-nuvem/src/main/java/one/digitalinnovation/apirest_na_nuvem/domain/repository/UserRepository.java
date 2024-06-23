package one.digitalinnovation.apirest_na_nuvem.domain.repository;

import one.digitalinnovation.apirest_na_nuvem.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);

}
