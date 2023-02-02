package comaprable_comparator;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){return this.age;}
    public String getName(){return this.name;}
    
    @Override
    public int compareTo(Student s) {
        if(this.age == s.age){return 0;}
        else{return this.age > s.age ? 1 : -1;}
    }


    @Override
    public String toString(){
        return " ";
    }

    public static void main(String[] args) {
        Student ss1 = new Student("Amar", 25);
        Student ss2 = new Student("Vinod", 28);

        int sorting = ss1.compareTo(ss2);

        switch(sorting){
            case -1: {
                System.out.println(ss2.getName()+" ----is older");
                break;
            }

            case 1: {
                System.out.println(ss1.getName() +"-----is older");
                break;
            }
            default:
            System.out.println("both are of same age..");
        }
    }



}
