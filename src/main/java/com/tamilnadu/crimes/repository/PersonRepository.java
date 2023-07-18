package com.tamilnadu.crimes.repository;

import com.tamilnadu.crimes.entity.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PersonRepository extends Neo4jRepository<Person, String> {
}
