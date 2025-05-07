package com.movierecom.reactive_movie_recommendation.presentation.dto.movie;

import com.movierecom.reactive_movie_recommendation.persistence.entity.movie.OriginalLanguage;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class MovieInsertDto {

    @Min(value = 1, message = "No debe ser menor a uno el ID")    
    private Long id;

    @NotBlank(message = "No debe ser nulo o vacío el titulo")
    private String title;

    @NotBlank(message = "No debe ser nulo o vacío el titulo original")
    private String originalTitle;

    private String backdropPath;

    private String posterPath;

    @NotBlank(message = "No debe ser nulo o vacío la descripción")
    private String overview;

    @Size(min = 1, max = 5, message = "No puede ser menos de uno ni más de cinco IDs")
    private Integer[] genreIDS;

    @Min(value = 0, message = "No puede ser menor a cero el conteo de votos")
    private Integer voteCount;

    @Min(value = 0, message = "No puede ser menor a cero la popularidad")
    private Double popularity;

    @Min(value = 0, message = "No puede ser menor a cero el promedio de votos")
    private Double voteAverage;

    @NotNull
    private Boolean adult;

    @NotNull
    private Boolean video;

    @NotNull
    private OriginalLanguage originalLanguage;
    
}

/*
 * @NotNull: El campo no debe ser null.
 * 
 * @NotEmpty: El campo no debe ser null y su tamaño debe ser mayor que cero.
 * 
 * @NotBlank: El campo no debe ser null y debe contener al menos un carácter que
 * no sea un espacio en blanco.
 * 
 * @Size: Controla el tamaño de cadenas, listas, arreglos, etc.
 * 
 * @Min y @Max: Define los valores mínimo y máximo para números.
 * 
 * @Email: Verifica si el campo tiene un formato de correo electrónico válido.
 * 
 * @Pattern: Define una expresión regular que el campo debe cumplir.
 * 
 * @Digits: Define el limite de dígitos que puedes ingresar en números enteros y
 * decimales.
 * 
 * @CreditCardNumber: Valida números de tarjetas de crédito
 * 
 * @Past: Solo acepta fechas pasadas del día actual (fechas).
 * 
 * @Future Solo acepta fechas futuras del día actual (fechas).
 * 
 * @AssertTrue: Solo acepta que el valor sea un true (Booleans).
 * 
 * @AssertFalse: Solo acepta que el valor sea un false (Booleans).
 */

