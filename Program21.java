//21. Program to sort an array of integers using simple linear sort mechanism.
import java.util.*;
class Program21
{
    public static void main(String args[])
    {
        int arr[]={90,60,50,30,20,15};
        int temp=0;
        System.out.println("Array Before Sorting : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
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