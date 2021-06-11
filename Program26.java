//26. Program to demonstrate the use of try..catch block for any type of exception / by 0
class Program26
{
    public static void main(String args[])
    {
        
            double res=0;
            double no1=Double.parseDouble(args[0]);
            double no2=Double.parseDouble(args[1]);
        try
        {
            res=no1/no2;
        }
        catch(Exception ex)
        {
            res=1;
            System.out.println(ex);
        }
        System.out.println("Result : "+res);
    }
}