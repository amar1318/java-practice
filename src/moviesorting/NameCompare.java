package moviesorting;

public class NameCompare {
    public int compare(Movie m1, Movie m2){
        return m1.getName().compareTo(m2.getName());
    }
}
