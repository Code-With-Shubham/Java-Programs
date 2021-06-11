/*20. Program to create an array and search for a number entered from command line and print the 
index where it is found.*/
class Program20
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9};

        int no=Integer.parseInt(args[0]);
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            if(no==i)
            {
                flag=true;
            }
           
        }
         if(flag==true)
             System.out.println("Found");
        else
             System.out.println("Not Found");
    }
}
