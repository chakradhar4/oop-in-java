//maintaining records of employees. class and objects
class Employee{
    int id;
    String name;
    int sal;
    void insert(int i,String n,int s)
    {
        id = i;
        name = n;
        sal = s;
    }
    void display(){
        System.out.println(id+" "+name+" "+sal);
    }
}
class TestEmployee{
    public static void main(String args[])
    {
      Employee e1 = new Employee();
      Employee e2 = new Employee();
      Employee e3 = new Employee();
      e1.insert(111,"chakradhar",200000);
      e2.insert(222,"krishan",20000);
      e3.insert(333,"sushil",200000);
      e1.display();
      e2.display();
      e3.display();
    }
} 


