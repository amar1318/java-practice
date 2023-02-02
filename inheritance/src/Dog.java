public class Dog extends Animal{
    String color = "black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }

    void eat(){
        System.out.println("eating bread..");

    }

    void bark(){
        System.out.println("barking..");
    }

    void work(){
        super.eat();
        eat();
        bark();

    }
}
