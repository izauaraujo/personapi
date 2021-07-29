package one.digitalinnovation.personapi.domain.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import one.digitalinnovation.personapi.domain.dto.request.PersonDTO;
import one.digitalinnovation.personapi.domain.entities.Person;


@Mapper(componentModel = "spring")
public interface PersonMapper {
	
    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);

}
