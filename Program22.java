//22. Program to sort an array of integers using bubble sort mechanism.
class Program22
{
    public static void main(String args[])
    {
        int arr[]={2,6,8,4,5,1,9};
        int temp=0;

        System.out.println("Number Before Swapping : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        for(int i=arr.length;--i>=0;)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("\nNumbers After sorting");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
