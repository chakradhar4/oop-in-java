class A extends Thread
{
    public void run()
    {
        for(int i = 1; i <=5; i++)
        {
            System.out.println("\t From ThreadA : i = "+i);
        }
        System.out.println("Exit from A ");
    }
}
class B extends Thread
{
    public void run ()
    {
        for (int j=1; j<=5; j++)
        {
            System.out.println("\t From Thread B : j "+j);
        }
        System.out.println("exit from thread B ");
    }
}
class C extends Thread{
    public void run()
    {
        for(int k=1;k<=5;k++ )
        {
            System.out.println("\tFrom Thread C : k = "+k);
        }
        System.out.println("exit from  c ");
    }
}
public class ThreadTest {
    public static void main(String args[])
    {
        new A().start();
        new B().start();
        new C().start();
    }
}
