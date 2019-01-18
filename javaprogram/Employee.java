class Employee{
String name ,id;
double sal;
Employee(String name,String id,double sal){
this.name=name;
this.id=id;
this.sal=sal;
}
public double getsal()
{
return sal
}
public void display()
{
System.out.println("Name="+name);
System.out.println("ID="+id);
System.out.println("Annual salary="+sal);
}
}