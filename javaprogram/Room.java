class Room{
boolean ac_on,ho_th,fa_on,lig_on;
void appliances(){
if(ac_on=="on")
{
System.out.println("ac is on");
}
if(ho_th=="on")
{
System.out.println("homw theature is on");
}
if(fa_on=="on")
{
System.out.println("fan is on");
}
if(lig_on=="on")
{
System.out.println("light is on");
}
}
void message(){
int ac_co=1200,ho_th=600,fa_co=400,lig_con=100;
if(ac_co+ho_th+fa_co+lig_con>2000)
{
System.out.println("overload");
}
}
}
class B{
public static void main(String args[]){
Room obj=new Room();
obj.appliances();
obj.message();
}
}
