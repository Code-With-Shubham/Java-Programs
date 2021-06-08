//6. Program to calculate interest and balance of an account no by taking deposit as command line args.
class Program6
{
    public static void main(String args[])
    {
        int bal=Integer.parseInt(args[0]);
        int deposit=Integer.parseInt(args[1]);

        int interest=(5*deposit)/100;
        System.out.println("Deposite : "+deposit+"\nInterest : "+interest);
    }
}