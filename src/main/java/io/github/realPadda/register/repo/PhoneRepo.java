package io.github.realPadda.register.repo;

import io.github.realPadda.register.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepo extends JpaRepository<Phone, Long> {
}
