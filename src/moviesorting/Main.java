package moviesorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Dark knight", 8.7, 2009));
        list.add(new Movie("interstellar", 8.9, 2011));
        list.add(new Movie("fight club", 8.1, 1999));
        list.add(new Movie("American beauty", 8, 1995));
        list.add(new Movie("joker", 8.5, 2020));

        Collections.sort(list);

        System.out.println("movies after sorting: ");
        System.out.println();
        for(Movie movie: list){
            System.out.println(movie.getName() +" "+
                                movie.getRating()+" "+
                                movie.getYear());
        }
    }
}
