//23. Program to demonstrate use functions of String class.
class Program23
{
    public static void main(String args[])
    {
        String str="I love java programming";

        System.out.println("Substring : "+str.substring(2,11));
        System.out.println("Lower Case : "+str.toLowerCase());
        System.out.println("Upper Case : "+str.toUpperCase());

        String conteststr=str.concat(" Because java is best programming language.");
        System.out.println("Concantination : "+conteststr);

        System.out.println("First Index : "+str.indexOf('o'));
        System.out.println("Last Index : "+str.lastIndexOf('o'));

        System.out.println("Char At : "+str.charAt(2));

        System.out.println("String Comparision : ");
        String s1="Hello Java";
        String s2="Java";
        int n=s1.compareTo(str);
        if(n>0)
        System.out.println(s2 +" is bigger..");
        else if(n<0)
        System.out.println(s1 +" is bigger..");
        else
        System.out.println("Both are same");


        if(str.startsWith("Th"))
        System.out.println("String starting with Th exists.. ");
        else
        System.out.println("String starting with Th does not exist.. ");

        if(str.endsWith("ing"))
        System.out.println("String ending with java exists.. ");
        else
        System.out.println("String ending with java does not exist.. ");

        if(str.equals(conteststr))
        System.out.println("Both strings are equal.. ");
        else
        System.out.println("Both strings are not equal.. ");

        if(s1.equalsIgnoreCase("hello JAVA"))
        System.out.println("Both strings are equal.. ");
        else
        System.out.println("Both strings are not equal.. ");

        String str1=" This is java ";
        System.out.println("Trim String : "+str1.trim());
        System.out.println(String.valueOf(26.6));
    }
}