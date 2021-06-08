//5. Program to print total and percentage of marks of three subjects for a student.
class Program5
{
    public static void main(String args[])
    {
        int m1,m2,m3;
        m1=Integer.parseInt(args[0]);
        m2=Integer.parseInt(args[1]);
        m3=Integer.parseInt(args[2]);

        double per=m1+m2+m3;
        double total=per/3;
        System.out.print("Percentage : "+total);
    }
}