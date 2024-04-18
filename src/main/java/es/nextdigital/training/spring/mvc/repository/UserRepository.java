package es.nextdigital.training.spring.mvc.repository;

import es.nextdigital.training.spring.mvc.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

  Optional<User> findByEmail(String email);
}
