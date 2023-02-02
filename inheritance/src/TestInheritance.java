public class TestInheritance {
    public static void main(String[] args) {
 //scenario 1
        // X x = new X();
        // System.out.println(x.a);
        // System.out.println(x.b);
        // //System.out.println(x.c);
        // x.m1();
        // x.m2();
        // //x.m3();

 //scenario 2       
        // Y y = new Y();
        // //System.out.println(y.a);
        // System.out.println(y.b);
        // System.out.println(y.c);
        // //y.m1();
        // y.m2();
        // y.m3();

 //scenario 3--getting error in x.c

        // X x = new Y();
        // System.out.println(x.a);
        // System.out.println(x.b);
        // //System.out.println(x.c);
        // x.m1();
        // x.m2();
        // //x.m3();

 //scenario 4--getting error in x.c
        // X x = new X();
        // Y y = new Y();
        // x = y;
        // System.out.println(x.a);
        // System.out.println(x.b);
        // //System.out.println(x.c);

 //scenario 5---resolved
        X x = new Y();
        Y y = new Y();
        y = (Y)x;
        System.out.println(y.a);
        System.out.println(y.b);
        System.out.println(y.c);
        y.m1();
        y.m2();
        y.m3();      
    }
}
