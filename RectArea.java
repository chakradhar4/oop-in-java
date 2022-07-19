//area of rectangle using using methods 
class Rectangle{
    int length;
    int breadth;
    void getData(int x, int y)
        {
            length = x;
            breadth = y;
        }
        int rectArea()
        {
            int area = length * breadth;
            return (area);
        }        
}
class RectArea{
    public static void main(String args[])
    {
        int area1,area2;
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        rect1.length = 15;
        rect1.breadth = 10;
        area1 = rect1.length* rect1.breadth;
        rect2.getData(20,12);
        area2 = rect2.rectArea();
        System.out.println("Area1 = " + area1);
        System.out.println("Area2 = "+ area2);
    }
}