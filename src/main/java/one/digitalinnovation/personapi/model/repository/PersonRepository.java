package one.digitalinnovation.personapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.personapi.model.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
