import java.util.Scanner;
public class else_if_ladder
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter your percentage :");
int percentage = sc.nextInt();
if(percentage>=100)
{
System.out.println("Plese enter Valid Percenage :");
}
if(percentage>91)
{
System.out.println("Execellent :");
}
else if(percentage>80)
{
System.out.println("very good ");
}
else if(percentage>70)
{
System.out.println("Good :");
}
else if(percentage>60)
{
System.out.println("pass only");
}
else if(percentage>50)
{
System.out.println("can do better more ");
}
else if(percentage>35)
{
System.out.println("average");
}
else
{
System.out.println("Fail ");
}
}
}