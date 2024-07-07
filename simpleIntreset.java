//to take input from the user and calculate the simple interest of given data //
import java.util.Scanner;
public class simpleIntreset
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter principle amount : ");
int principle = sc.nextInt();
System.out.println("Enter rate of interet : ");
float rate = sc.nextFloat();
System.out.println("Enter period in year : ");
float year = sc.nextInt();
float finalsi = (principle * rate * year)/100;
System.out.println("the simple interest is : "+finalsi);
}
}