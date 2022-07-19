// area of rectangle using constructor
class Rectangle{
    private int length;
    private int width;
    Rectangle(int x, int y)
    {
        length = x;
        width = y;
    }
    int rectArea()
    {
        return(length * width);
    }
}    
class RectangleArea{
    public static void main(String args[])
    {
        Rectangle rect1 = new Rectangle(10,5);
        int area1  = rect1.rectArea();
        
        System.out.println("Area of rectangle  = " + area1);
        

    }

}

    
    

