package dev.danvega.runnerz.user;

import java.util.List;
import org.springframework.web.service.annotation.GetExchange;

public interface UserHttpClient {

  @GetExchange("/users")
  List<User> findAll();

  @GetExchange("/{id}")
  User findById(Integer id);
}
