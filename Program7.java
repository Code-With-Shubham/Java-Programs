//7. Program to find greatest of two numbers by using tertiary operator and taking input from 
//command line arguments.

class Program7
{
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        String res=(a>b)? a+" is greater" : b+" is greater";
        System.out.println(res);
    }
}