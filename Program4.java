//4. Program to calculate area of rectangle by taking length and breadth as input from command line
class Program4
{
    public static void main(String args[])
    {
        int length,breadth;
        length=Integer.parseInt(args[0]);
        breadth=Integer.parseInt(args[1]);

        double area=length*breadth;
        System.out.println("Area of rectangle : "+area);
    }
}