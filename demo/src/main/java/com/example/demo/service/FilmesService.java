package com.example.demo.service;

import com.example.demo.entity.Filmes;
import com.example.demo.repository.FilmesRepository;
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
