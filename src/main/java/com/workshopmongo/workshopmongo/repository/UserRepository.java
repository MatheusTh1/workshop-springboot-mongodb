package com.workshopmongo.workshopmongo.repository;

import com.workshopmongo.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository //Estou falando que é um repositório
public interface UserRepository extends MongoRepository<User, String>{ // Estou mandando herdar do mongo e precisa de dois dados, o que ele vai gerenciar? e qual o tipo do ID, no caso vai ser a classe User gerenciada e ID e do tipo String.
}
