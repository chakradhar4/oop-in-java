import java.util.Scanner;
class Room{
    Scanner as;
    int l,b;
    Room()
    {
        as = new Scanner(System.in);
        System.out.println("enter the length of the room : ");
        l = as.nextInt();
        System.out.println("enter the breadth of the room : ");
        b = as.nextInt();
    }
    int area(){
        return(l*b);
    }
    class Bedroom extends Room{
        int h;
        Bedroom()
        {   
           super(
           System.out.println("enter the height of the room : ");
           h = as.nextInt();
        }
        int volume()
        {
            System.out.println("volune of the room is ");
            return(l*b*h);
        }
    }

}
public class Singleinherit {
    public static void main (String args[]){
        Room r1  = new Room();
        int area1 =r1.area();
        System.out.println("area  of the room is : "+area1);
        Bedroom b1 = new Bedroom();
        int v1 = r1.volume();
        System.out.println("volume of the room is"+ v1);


    }
    
}
