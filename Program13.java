//13. Program to midpoint of a range of values e.g.100 to 200 by using empty body of while loop. 
class Program13
{
    public static void main(String args[])
    {
        int a=100,b=200;
        while(++a<--b);
        System.out.println("Range Midpoint is : "+a);

    }
}