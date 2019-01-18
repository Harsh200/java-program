class Electricload{
String name.id;
int ac,fan,led,gys;
private double Calload()
{
return(ac*1500+ fan *200 + led *20 +gys *1000)/1000.0)
}
private String Status()
{
if(calload()>5)
 return "overload";
return "underload"
}
void PrintDetails()
{
System.out.println("name:"+name);
System.out.println("id:"+ id);
System.out.println("currentload"+calload);
system.out.println("status:"+status());
}
}
