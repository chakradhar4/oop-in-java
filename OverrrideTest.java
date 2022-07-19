class Sap{
    int x;
    Sap(int x)
    {
         this.x   = x;
    }
    void display()
    {
       System.out.println("super x  = "+x);
    }  
}
class Map extends Sap{
    int y;
    Map(int x,int y)
    {
        super(x);
        this.y = y;
    }
    void display()
    {
        System.out.println(" super x = "+x);
        System.out.println(" sub y = "+y);
    }
}
public class OverrrideTest { 
    public static void main(String args[])
    {
       Map m1 =  new Map(78,12);
       m1.display();

    }  
}
