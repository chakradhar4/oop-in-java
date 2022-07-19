class A1 extends Thread{
    public void run()
    {
        for( int i = 1; i<=5;i++)
        {
            if(i == 10) 
            A1.yield();
            System.out.println("\tFrom thread A : i = "+i);
        }
        System.out.println("exit from A ");
    }
}
class B1 extends Thread{
    public void run()
    {
        for(int j = 1;j<=5;j++)
        {
            System.out.println("\tFrom thread B : j = "+j);
            if(j == 3) stop();
        }
        System.out.println("exit from B");
    }
}
class C1 extends Thread{
    public void run()
    {
        for(int k = 1; k<=5; k++)
        {
            System.out.println("\tFrom thread C : K = "+k);
            if(k==1)
            try 
                {
                    sleep(1000);  
                }
                catch (Exception e)
                {

                }
        }
        System.out.println("exit from C ");
    }
}
public class ThreadMethods {
    public static void main(String args[])
    {
        A1 threadA1 = new A1();
        B1 threadB1 = new B1();
        C1 threadC1 = new C1();
        System.out.println("Start thread A ");
        threadA1.start();
        System.out.println("start thread B ");
        threadB1.start();
        System.out.println("start thread c ");
        threadC1.start();
        System.out.println("end  of the main thread");

    }           
}
