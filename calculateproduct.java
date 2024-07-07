import java.util.Scanner;
public class calculateproduct
{
//this is product function
public static float calculateproduct(float x, float y )
{
return x * y;
}
//this is main function 
public static void main(String args [])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter first value :");
float value1 = sc.nextFloat();
System.out.println("Enter second value :");
float value2 = sc.nextFloat();
float result = calculateproduct(value1 , value2);
System.out.println("The product of two number is :"+ result );
}
}

