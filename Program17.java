//17. Program to find greatest of the set of values using for and for-each loop.
class Program17
{
    public static void main(String args[])
    {
        int arr[]={45,23,98,74,65};
        int g=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>g)
            g=arr[i];
        }
        System.out.println("For Loop : "+g);
        g=arr[0];
        for(int x : arr)
        {
            if(x>g)
            g=x;
        }
        System.out.println("For-each Loop : "+g);
    }
}