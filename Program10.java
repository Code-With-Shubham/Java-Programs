/*10. Program to print grade acquired by a student by taking marks of three subjects from command 
line using switch..case statement.\
*/
class Program10
{
    public static void main(String args[])
    {
        int m1,m2,m3;
        m1=Integer.parseInt(args[0]);
        m2=Integer.parseInt(args[1]);
        m3=Integer.parseInt(args[2]);

        int total=m1+m2+m3;
        double per=Math.round((total*100)/300);
    
        char gr='X';

        if(per<=100 && per>=75)
        gr='A';
        else if(per<75 && per>=60)
        gr='B';
        else if(per<60 && per>=45)
        gr='C';
        else if(per<45 && per>=34)
        gr='D';

        int value=0;
        switch(gr)
        {
            case 'A':
            value=1;
            System.out.println("Aquired Distiction");
            break;

            case 'B':
            value=1;
            System.out.println("First Class");
            break;

            case 'C':
            value=1;
            System.out.println("Second Class");
            break;

            case 'D':
            value=1;
            System.out.println("Third Class");
            break;
        }
        if(value==1)
        {
            System.out.println("Your Percentage : "+per);
        }
    }
}