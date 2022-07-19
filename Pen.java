class Ballpen{
    String color;
    String type;
    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
public class Pen{
    public static void main(String args []){
       Ballpen pen1 =  new Ballpen();
       pen1.color  = "blue" ;
       pen1.type = "sketch";
       pen1.write();

       Ballpen pen2  = new Ballpen();
       pen2.color= "black";
       pen2.type = " ball point";
       pen1.printColor();
       pen2.printColor();
    }    
}
