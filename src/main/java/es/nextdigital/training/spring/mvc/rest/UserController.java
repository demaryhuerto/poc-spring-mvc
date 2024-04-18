package es.nextdigital.training.spring.mvc.rest;

import es.nextdigital.training.spring.mvc.domain.User;
import es.nextdigital.training.spring.mvc.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

  private final UserRepository userRepository;

  @GetMapping("/email/{email}")
  @ResponseStatus(HttpStatus.OK)
  public Optional<User> getUserByEmail(@PathVariable("email") String email) {
    return userRepository.findByEmail(email);
  }
}
