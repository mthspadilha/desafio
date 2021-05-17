package io.github.realPadda.register.repo;

import io.github.realPadda.register.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Long> {
}
