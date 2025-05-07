package com.movierecom.reactive_movie_recommendation.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.movierecom.reactive_movie_recommendation.persistence.entity.movie.MovieEntity;
import com.movierecom.reactive_movie_recommendation.persistence.entity.movie.OriginalLanguage;
import com.movierecom.reactive_movie_recommendation.persistence.repository.movie.IMovieRepository;

import reactor.core.publisher.Flux;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(IMovieRepository repository) {
        return args -> {
            List<MovieEntity> movies = List.of(
                new MovieEntity(null, 1233069L, "Exterritorial", "Exterritorial", 
                "/ybBIIzDL1B9yH8OVFav81JTZmoN.jpg", "/jM2uqCZNKbiyStyzXOERpMqAbdx.jpg",
                "When her son vanishes inside a US consulate", new Integer[]{53,28}, 179, 723.7982, 
                6.779, false, false, OriginalLanguage.DE),
                
                new MovieEntity(null, 1197306L, "A Working Man", "A Working Man",
                "/fTrQsdMS2MUw00RnzH0r3JWHhts.jpg", "/6FRFIogh3zFnVWn7Z6zcYnIbRcX.jpg",
                "Levon Cade left behind a decorated military career", new Integer[]{28,80,53}, 576,
                482.7613, 6.505, false, false, OriginalLanguage.EN),

                new MovieEntity(null, 986056L, "Thunderbolts", "Thunderbolts",
                "/rthMuZfFv4fqEU4JVbgSW9wQ8rs.jpg", "/m9EtP1Yrzv6v7dMaC9mRaGhd1um.jpg",
                "After finding themselves ensnared in a death trap", new Integer[]{28,12,878}, 491,
                427.329, 7.576, false, false, OriginalLanguage.EN)
            );
            // MovieEntity(String idMongo, Long id, String title, String originalTitle, String backdropPath, String posterPath, String overview, Integer[] genreIDS, Integer voteCount, Double popularity, Double voteAverage, Boolean adult, Boolean video, OriginalLanguage originalLanguage)
    
            repository.deleteAll()
                .thenMany(Flux.fromIterable(movies))
                .flatMap(repository::save)
                .subscribe();
        };
    }
    
}
