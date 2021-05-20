package io.github.realPadda.register.repo;

import io.github.realPadda.register.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
