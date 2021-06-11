//27. Program to demonstrate the use of try..catch block using Exception class.
class Program27
{
    public static void main(String args[])
    {
        int n,sq;
        try
        {
            n=Integer.parseInt(args[0]);
        }
        catch(Exception e)
        {
            n=0;
            System.out.println("Invalid or no input..plz enter a number and try again");
        }
        sq=n*n;
        System.out.println("Square is "+sq);
    }
}