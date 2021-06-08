//1. Program to calculate area and circumference of circle by using final PI variable
class Program1
{
    public static void main(String args[])
    {
        double PI=3.14;
        double r=5;

        
        double area=PI*r*r;
        System.out.println("Area of circle : "+area);

        double circumference=2*PI*r;
        System.out.println("Circumference of circle : "+circumference);
    }
}