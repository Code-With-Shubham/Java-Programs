//15. Program to print greatest of all the values entered from command line using for loop.
class Program15
{
    public static void main(String args[])
    {
        int arr[] = new int[args.length];
        for(int i=0;i<args.length;i++)
        {
            arr[i]=Integer.parseInt(args[i]);
        }

        int g=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>g)
            g=arr[i];
        }
        System.out.println("Greatest No Entered : "+g);
        
    }
}