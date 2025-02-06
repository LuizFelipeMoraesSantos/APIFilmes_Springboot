package com.example.demo.repository;

import com.example.demo.entity.Filmes;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FilmesRepository extends MongoRepository<Filmes, ObjectId> {


}

