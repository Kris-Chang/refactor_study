package com.kris.study;

/**
 * Created by Kris on 16/5/4.
 */
public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    Price _price;

    public Movie(String _title, int _priceCode) {
        this._title = _title;
        setPriceCode(_priceCode);
    }

    public int getFrequentRentPoints(int daysRented) {
        if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1){
            return 2;
        }
        return 1;
    }

    public double getCharge(int daysRented){
        return _price.getCharge(daysRented);
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int _priceCode) {
        switch (_priceCode){
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("incorrect _price code");
        }
    }

    public String getTitle() {
        return _title;
    }
}
