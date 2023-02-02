package moviesorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student(1, "Amar", 25));
        arr.add(new Student(4, "Satya", 30));
        arr.add(new Student(3, "Rakesh", 28));

        System.out.println("Sorting by name:  ");
        Collections.sort(arr,new NameComparator());
        for(Student st : arr){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("------------");
        System.out.println("Sorting by Age:  ");
        Collections.sort(arr, new AgeComparator());
        for(Student st : arr){
            System.out.println(st.age+" "+st.name+" " +st.rollno);
        }
    }
}
