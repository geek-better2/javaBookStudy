package com.refactor.domain;


import lombok.Getter;
import lombok.Setter;

/**
 * @author hai
 */
public class Rental {
    @Setter@Getter
    private Movie movie;

    @Setter@Getter
    private int daysRented;



    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

}
