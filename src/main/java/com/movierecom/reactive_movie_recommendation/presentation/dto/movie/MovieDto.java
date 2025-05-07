package com.movierecom.reactive_movie_recommendation.presentation.dto.movie;

import com.movierecom.reactive_movie_recommendation.persistence.entity.movie.OriginalLanguage;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MovieDto {

    private String idMongo;

    private Long id;

    private String title;

    private String originalTitle;

    private String backdropPath;

    private String posterPath;

    private String overview;

    private Integer[] genreIDS;

    private Integer voteCount;

    private Double popularity;

    private Double voteAverage;

    private Boolean adult;

    private Boolean video;

    private OriginalLanguage originalLanguage;
    
}
