/*
(III) Control Structures and Looping
8. Program to read a number and check whether it is greater than 20. If greater print its square else 
print the no with message as it is less than 20 using simple if else structure.
*/
class Program8
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);

        if(n>=20)
        {
            int i=n*n;
            System.out.print("Square : "+i);
        }
        else
        {
            System.out.print("Number is less than 20 ");
        }
    }
}