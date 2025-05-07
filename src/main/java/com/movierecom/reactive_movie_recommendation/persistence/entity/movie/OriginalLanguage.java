package com.movierecom.reactive_movie_recommendation.persistence.entity.movie;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum OriginalLanguage {
    
    DE("de"), EN("en"), HI("hi");

    private final String value;

    private OriginalLanguage(String value) {
        this.value = value;
    }
    
    public String toValue() {
        return value;
    }
    
    private static final Map<String, OriginalLanguage> LANGUAGE_MAP = 
        Stream.of(values())
            .collect(Collectors.toMap(OriginalLanguage::toValue, e -> e)); 

    public static OriginalLanguage forValue(String value) {
        return LANGUAGE_MAP.getOrDefault(value, null);
    }

}
