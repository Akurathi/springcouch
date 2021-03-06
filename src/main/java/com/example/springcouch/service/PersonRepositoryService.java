package com.example.springcouch.service;

import com.example.springcouch.model.Person;
import com.example.springcouch.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("PersonRepositoryService")
public class PersonRepositoryService implements PersonService {

    @Autowired
    private PersonRepository repo;

    public Person findOne(String id) {
        return repo.findById(id).get();
    }

    public List<Person> findAll() {
        List<Person> people = new ArrayList<Person>();
        for (Person person : repo.findAll()) {
            people.add(person);
        }
        return people;
    }

    public List<Person> findByFirstName(String firstName) {
        return repo.findByFirstName(firstName);
    }

    public void create(Person person) {
        person.setCreated(LocalDateTime.now());
        repo.save(person);
    }

    public void update(Person person) {
        person.setUpdated(LocalDateTime.now());
        repo.save(person);
    }

    public void delete(Person person) {
        repo.delete(person);
    }
}
