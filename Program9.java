//9. Program to print age group of a person by taking age as input from command line.
class Program9
{
    public static void main(String args[])
    {
        int age=Integer.parseInt(args[0]);

        if(age>0 && age<18)
        {
            System.out.println("Young Age");
        }
        else if(age>=18 && age<40)
        {
            System.out.println("Middle Age");
        }
        else if(age>=40)
        {
            System.out.println("Old Age");
        }
        else
        {
            System.out.println("Invalid Age ");
        }
    }
}