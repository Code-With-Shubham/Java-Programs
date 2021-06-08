//2. Program to swap two integers without using temp variable
class Program2
{
    public static void main(String args[])
    {
        int a=10,b=20;

        System.out.println("Number Before Swapping : "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Number After Swapping  : "+a+" "+b);
    }
}