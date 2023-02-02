
public class Sat implements Drawable{
    
    @Override
    public void draw(){
        System.out.println("drawing a circle");
    }

    public static void main(String[] args) {
        Sat sat = new Sat();
        sat.draw();
    }
}