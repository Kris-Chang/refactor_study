package com.kris.study;

/**
 * Created by Kris on 16/5/4.
 */
public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public double getCharge(){
        return _movie.getCharge(_daysRented);
    }

    public int getFrequentRentPoints() {
        return _movie.getFrequentRentPoints(this._daysRented);
    }
}
