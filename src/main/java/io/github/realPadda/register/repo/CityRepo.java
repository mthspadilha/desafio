package io.github.realPadda.register.repo;

import io.github.realPadda.register.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepo extends JpaRepository<City, Long> {
}
