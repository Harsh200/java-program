import java.util.*;
class M{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String a,b;
double c;
Employee e[]=new Employee[5];
for(int i=0; i<5; i++){
System.out.println("enter name");
a=s.nextLine();  
System.out.println("enter id");
b=s.nextLine();
System.out.println("enter salary");
c=s.nextDouble();
e[i]=new Employee(a,b,c);
s.nextLine();
}
int j=0;
for(int i=0; i<5; i++)
{ 
if(e[j].sal<e[i].sal)
j=i;
}
e[j].display();

}
}

