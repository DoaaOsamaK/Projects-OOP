
package shapes;

public class Shapes {

    public void draw(){
        System.out.println("Drawing a shape");
    }
    
    public static void main(String[] args) {
        Circle c1=new Circle();
        Rectangle r1 = new Rectangle();
        Shapes sh1= new Shapes();
        
        c1.draw();
        r1.draw();
        r1.draw(8);
        sh1.draw();
        
    }
    
}
