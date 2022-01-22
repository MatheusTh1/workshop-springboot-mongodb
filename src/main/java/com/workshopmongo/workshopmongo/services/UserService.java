package com.workshopmongo.workshopmongo.services;
import com.workshopmongo.workshopmongo.domain.User;
import com.workshopmongo.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service //Informando que é um serviço do User, agora consigo injetar em outras classes
public class UserService {

    @Autowired  //Instancia o repositório, permitindo o SERVIÇO conversar com REPOSITÓRIO!
    private UserRepository repo;

    public List<User> findAll(){ // Metodo para retornar todos os usuarios do banco
        return repo.findAll();
    }
}

