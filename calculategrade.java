import java.util.Scanner;
public class calculategrade
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter a your percentage :");
int percentage = sc.nextInt();
if(percentage<30)
{
System.out.println("Fail :");
}
else if(percentage >=30)
{
System.out.println("D grade :");
}
else if(percentage>=60 )
{
System.out.println("C grade :");
}
else if(percentage>=75)
{
System.out.println("B grade :");
}
else if(percentage>=90)
{
System.out.println("A grade :");
}

}
}f