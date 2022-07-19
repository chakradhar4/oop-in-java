//initialization of object throught instance variable
class Student{
    int id;
    String name;
}
class Student2{
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.id= 1000;
        s1.name = "chakradhar";
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
