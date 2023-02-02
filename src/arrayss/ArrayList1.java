package arrayss;
import java.util.ArrayList;

//3. Write a Java program to insert an element 
//into the array list at the first position.
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("blue");
        list.add("yellow");

        System.out.println(list);
        list.add(0, "pink");
        list.add(2, "purple");
        System.out.println(list);
    }
}
