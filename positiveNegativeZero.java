import java.util.Scanner;
public class positiveNegativeZero {
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter an integer :  ");
int inputvalue = sc.nextInt();
if(inputvalue<0)
{
System.out.println("negative value :");
}
else if(inputvalue>0) 
{
System.out.println("positive value ");
}
else
{ 
System.out.println("zero value ");
}
}
    
}
