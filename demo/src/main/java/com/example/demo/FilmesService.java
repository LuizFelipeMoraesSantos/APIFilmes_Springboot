package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FilmesService {

    private final FilmesRepository filmesRepository;

    public FilmesService(FilmesRepository filmesRepository) {
        this.filmesRepository = filmesRepository;
    }

    public List<Filmes> todosFilmes(){
        return filmesRepository.findAll();
    }
}
