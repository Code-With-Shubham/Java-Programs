//16. Program to print value entered and sum of all the values entered by using for-each loop.
class Program16
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;

        for(int i : arr)
        {
            System.out.println(i);
            sum=sum+i;

        }
        System.out.println("sum : "+sum);
    }
}