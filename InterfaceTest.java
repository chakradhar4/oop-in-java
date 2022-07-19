//implementing interfaces
interface Area //interface defined
{
    final static float pi  =  3.14F;
    float compute(float x,float y);
}
class Rectangle1 implements Area{
    public float compute(float x,float y)
    {
    
        return(x*y);
}
}
class Circle1 implements Area{
    public float compute(float x, float y){
        return(pi*x*x);
    }
}
public class InterfaceTest{
    public static void main (String args[])
    {
        Rectangle1 rect = new Rectangle1();
        Circle1 cir = new Circle1();
        Area area;
        area =  rect;
        System.out.println("Area of the rectangle = "+area.compute(10,20));
        area =cir;
        System.out.println("area of circle = "+area.compute(10,0));
    }
    
}
