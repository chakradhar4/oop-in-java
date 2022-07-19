/*create a class student to store 
their name, ID no., Marks of Maths, Physics, Chemistry.*/

import java.util.Scanner;
class Studenth          {
    private String name;
    private String id;
    private int maths,Physics,Chemistry;
    Scanner ac; 
    void getdata()
        {
           ac =new Scanner(System.in);
           System.out.println("Enter Name :");
           name = ac.nextLine();
           System.out.println("enter ID :");
           id = ac.nextLine();
           System.out.println("Enter maths marks :");
           maths = ac.nextInt();
           System.out.println("Enter physics marks :");
           Physics = ac.nextInt();
           System.out.println("Enter chemistry marks :");
           Chemistry = ac.nextInt();
        }
    void display()
    {
        System.out.println("name ="+name+"\nID = "+id+"\nmaths = "+maths+"\nPhysics = "+Physics+"\nChemistry = "+Chemistry);    
    }

}
class StudentMarks{
    public static void main(String args[])
    {
        Studenth s1 = new Studenth();
        s1.getdata();
        s1.display();
    }
}