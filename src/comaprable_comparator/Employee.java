package comaprable_comparator;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
    private int id;
    private String name;
    private int age;
    private long salary;

    public Employee(int id, String name, int age, long salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId(){return id;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public long getSalary(){return salary;}


    @Override
    public int compare(Employee o1, Employee o2) {
        // TODO Auto-generated method stub
        return (thi);
    }


    
    
}
