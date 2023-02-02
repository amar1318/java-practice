//comaparable example
package moviesorting;
import java.util.*;
//using compareTo() method for sorting
public class Movie implements Comparable<Movie>{
    private double rating;
    private String name;
    private int year;
//used to sort by year
    @Override
    public int compareTo(Movie m) {
        // TODO Auto-generated method stub
        return this.year - m.year;
    }
//constructor
    public Movie(String nm, double rt, int yr){
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

//getter methods
    public double getRating(){return rating;}
    public String getName(){return name;}
    public int getYear(){return year;}
    
}


class NameCompare {
    public int compare(Movie m1, Movie m2){
        return m1.getName().compareTo(m2.getName());
    }
}

class RatingCompare {
    public int compare(Movie m1, Movie m2){
        if(m1.getRating() < m2.getRating()) return -1;
        if(m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}

class Main{
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("dark knight", 9, 2009));
        list.add(new Movie("Joker", 8, 2019));
        list.add(new Movie("Interstellar", 8.7, 2015));

        System.out.println("sorted by rating--");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for(Movie movie : list){
            System.out.println(movie.getRating()+" "+
                                movie.getName()+" "+
                                movie.getYear());
        }

    }
}

