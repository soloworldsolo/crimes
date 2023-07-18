package com.tamilnadu.crimes.rest;

import com.tamilnadu.crimes.dto.PersonDTO;
import com.tamilnadu.crimes.entity.Person;
import com.tamilnadu.crimes.repository.PersonRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    PersonRepository personrepository;

    public PersonController(PersonRepository personrepository) {
        this.personrepository = personrepository;
    }

    @PostMapping("/person")
    public Person savePerson(@RequestBody PersonDTO personDTo) {
        return personrepository.save(new Person(personDTo.name(), personDTo.city()));
    }
}
