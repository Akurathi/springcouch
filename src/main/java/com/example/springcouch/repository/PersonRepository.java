package com.example.springcouch.repository;

import com.example.springcouch.model.Person;
import org.springframework.data.couchbase.core.query.View;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, String> {

    @View
    List<Person> findByFirstName(String firstName);

}

