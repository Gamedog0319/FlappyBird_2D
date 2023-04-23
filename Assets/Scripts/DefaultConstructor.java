class DefaultConstructor
{
int Sid;
String Sname;

{
System.out.println("Default Constructor method gets calledautomatically");
Sid=846;
Sname="Sowmya";
}
void showDetails()
{
System.out.println("Hello");
}
public static void main(String[] args)
{
//creating object
DefaultConstructor object = new DefaultConstructor();object.showDetails();
}
}