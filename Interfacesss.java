//implementning multiple inheritance
class Student1{
    int rollnumber;
    void getData(int n)
    {
        rollnumber = n;
    }
    void putNumber()
    {
        System.out.println("roll number = "+rollnumber);
    } 
}
class Test1 extends Student1
{
    float part1,part2;
    void getMarks(float m1,float m2)
    {
        part1 = m1;
        part2 = m2;
    }
    void putMarks()
    {
        System.out.println("marks obtained");
        System.out.println("part1 = "+part1);
        System.out.println("part2 = "+part2);
    }
}
interface Sports{
    float sportWt = 6.0F;
    void putWt();
}
class Results extends Test1 implements Sports
{
    float total;
    public void putWt()
    {
        System.out.println("Sports Wt = "+sportWt);
    }
    void display()
    {
        total = part1 + part2 + sportWt;
        putNumber();
        putMarks();
        putWt();
        System.out.println("Total marks = "+total);
    }

}
class interfacesss{
    public static void main(String args []) 
    {
        Results student1 =  new Results();
        student1.getData(1234);
        student1.getMarks(27.5F,33.0F);
        student1.display();  
    }
}