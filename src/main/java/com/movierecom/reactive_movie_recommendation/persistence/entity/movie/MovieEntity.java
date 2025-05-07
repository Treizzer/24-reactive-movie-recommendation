package com.movierecom.reactive_movie_recommendation.persistence.entity.movie;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "movies")
public class MovieEntity {
    
    // My own ID saved in mongodb
    // @Field(name = "id")
    @Id
    private String idMongo;

    @Field(name = "movie_id")
    private Long id;

    private String title;

    @Field(name = "original_title")
    private String originalTitle;

    @Field(name = "backdrop_path")
    private String backdropPath;

    @Field(name = "poster_path")
    private String posterPath;

    private String overview;

    @Field(name = "genre_ids")
    private Integer[] genreIDS;

    @Field(name = "vote_count")
    private Integer voteCount;

    private Double popularity;

    @Field(name = "vote_average")
    private Double voteAverage;

    private Boolean adult;

    private Boolean video;

    @Field(name = "original_language")
    private OriginalLanguage originalLanguage;

}
