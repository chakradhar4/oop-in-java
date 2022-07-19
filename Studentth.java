import bank;
class Studentclass{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Studentth{
    public static void main(String args[])
    {
        Studentclass s1 =   new Studentclass();
        s1.name = "chkrdhr";
        s1.age = 21;
        s1.printInfo();

    }
}