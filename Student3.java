//creating multiple using reference variable
class Student{
    int id;
    String name;
}
class Student3{
    public static void main(String args[])
    {
     Student s1 = new Student();
     Student s2 = new Student();
     s1.id = 100;
     s2.id = 200;
     s1.name = "chakradhar";
     s2.name = "krishna";
     System.out.print(s1.id);
     System.out.println(s1.name);
     System.out.print(s2.id);
     System.out.println(s2.name);
    }
}
