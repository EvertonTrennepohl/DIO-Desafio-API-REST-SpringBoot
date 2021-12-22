package one.digitalinnovation.personapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.repository.PersonRepository;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
	
	private PersonRepository personRepository;
	
	@Autowired
	public PersonController(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@PostMapping
	public String createPerson(@RequestBody Person person) {
		personRepository.save(person);
		return "criado";
	}

}
