package itish.SortingObjectComparableAndCompartor;

public class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;
    // constructor

    public Movie(String name,double rating ,int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
    // implementing the compareTo method for sorting in year
    public int compareTo(Movie m){
        return this.year - m.getYear();
    }

}
