import java.util.*;

 class Exam{

public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    String str,a;
    char ch;
    int count=0;

    System.out.println("Enter the string:");
    str=sc.nextLine();
 System.out.println("Enter the string you want:");
    a=sc.nextLine();

    while (str.length()>0)
    {
if(str==a)
{
count++;
       
    }
  System.out.println(count);
    }
}



}
