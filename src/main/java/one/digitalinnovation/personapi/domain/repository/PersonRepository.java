package one.digitalinnovation.personapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.personapi.domain.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
