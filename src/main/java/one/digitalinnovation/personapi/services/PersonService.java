package one.digitalinnovation.personapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import one.digitalinnovation.personapi.model.dto.mapper.PersonMapper;
import one.digitalinnovation.personapi.model.dto.request.PersonDTO;
import one.digitalinnovation.personapi.model.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.model.entities.Person;
import one.digitalinnovation.personapi.model.repository.PersonRepository;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

	private final PersonRepository personRepository;

	private final PersonMapper personMapper;
	
	public MessageResponseDTO create(PersonDTO personDTO) {
        Person person = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(person);

        MessageResponseDTO messageResponse = createMessageResponse("Person successfully created with ID ", savedPerson.getId());

        return messageResponse;
    }
	
	
	
	
	private MessageResponseDTO createMessageResponse(String s, Long id2) {
        return MessageResponseDTO.builder()
                .message(s + id2)
                .build();
    }
}
