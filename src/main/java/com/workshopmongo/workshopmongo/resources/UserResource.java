package com.workshopmongo.workshopmongo.resources;

import com.workshopmongo.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController //definindo que essa classe vai ser um REST
@RequestMapping(value = "/users") //passando o ENDPOINT de onde vai ser acessado (para buscar no postman).
public class UserResource {


    @GetMapping //Estou dizendo que esse metodo vai retornar no ENDPOINT REST no caminho "USERS". ou poderia utilizar o @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity <List<User>> findAll() { //metodo para retornar uma LISTA DE USUARIOS da classe USER.
        User matheus = new User("1","Matheus","Matheus@gmail.com");  //criando uma variavel do tipo USER, instanciando dizendo que vai receber um novo objeto do mesmo tipo com os dados.
        User lucas = new User("2","Lucas","Lucas@gmail.com");
        List<User> list = new ArrayList<>(); // criando uma lista para adicionar os dados acima, precisa instanciar com ARRAY LIST pois o LIST É interface não sendo possivel instanciar.

        list.addAll(Arrays.asList(matheus, lucas)); //adicioando os dados na lista!
        //return list; //retornado a list na função
        return ResponseEntity.ok().body(list); //retorna a list porém com uma estrutura HTTP, formatado!
    }
}
