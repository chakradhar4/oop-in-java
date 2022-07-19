import java.util.Scanner;
class Nesting{
    int m,n;
    Scanner sk;
    Nesting()
    {
        sk = new Scanner(System.in);
        System.out.println("enter the first value ");
        this.m = sk.nextInt();
        System.out.println("enter the second value ");
        this.n = sk.nextInt();
    }
    int largest()
    {
        if(m>n)
        return (m) ;
        else 
        return (n) ;
    }
    void display()
    {
        int large = largest();
        System.out.println("largest value is "+large);
    }
}
public class NestingTest{
    public static void main(String args[])
    {
        Nesting  n1 = new Nesting();
        n1.display();
    }    
}
