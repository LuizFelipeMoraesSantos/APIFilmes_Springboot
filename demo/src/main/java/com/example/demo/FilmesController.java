package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/filmes")
public class FilmesController {
    @GetMapping
    public ResponseEntity<String> todosFilmes(){
        return new ResponseEntity<String>("Todos os filmes!", HttpStatus.OK);
    }
}
