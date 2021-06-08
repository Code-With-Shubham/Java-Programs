//3. Program to calculate daily wages of a worker taking wages as input from command line.
class Program3
{
    public static void main(String args[])
    {
        int days=30;
        int wages=Integer.parseInt(args[0]);
        double sal=days*wages;
        System.out.println("Salary is : "+sal);
    }
}