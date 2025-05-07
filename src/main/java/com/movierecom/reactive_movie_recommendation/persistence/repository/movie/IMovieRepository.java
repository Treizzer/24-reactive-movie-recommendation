package com.movierecom.reactive_movie_recommendation.persistence.repository.movie;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.movierecom.reactive_movie_recommendation.persistence.entity.movie.MovieEntity;

@Repository
public interface IMovieRepository extends ReactiveMongoRepository<MovieEntity, String> {
}
