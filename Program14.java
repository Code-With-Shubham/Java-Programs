//14. Program to print no, square and its cube by using for loop from 1 to 10
class Program14
{
    public static void main(String args[])
    {
        int i;
        int sq=0,cube=0;
        System.out.println("Number"+"    "+"Sqare"+"    "+"Cube");
        for(i=1;i<=10;i++)
        {
            sq=i*i;
            cube=i*i*i;
            System.out.println("  "+i+"        "+sq+"         "+cube);
        }
        
        
    }
}