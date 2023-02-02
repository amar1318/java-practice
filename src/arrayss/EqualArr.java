package arrayss;
//Write a program in Java for, How to compare two array is equal in size or not.
public class EqualArr {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = {1,2,3};
        int aSize = a.length;
        int bSize = b.length;

        if(aSize != bSize){
            System.out.println("not equal");
        }

        for(int i=0; i<aSize; i++){
            if(a[i] != b[i])
                System.out.println("not equal");
            }
            System.out.println("equal");
        }
    }
    

