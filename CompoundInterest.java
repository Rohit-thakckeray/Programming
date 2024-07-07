import java.util.Scanner;
public class CompoundInterest {
public static void main(String args [])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter principle amount : ");
int principle = sc.nextInt();
System.out.println("Enter rate of interest : ");
float rate = sc.nextFloat();
System.out.println("Enter period in year : ");
float year = sc.nextFloat();
//logic of compound intrest//
double compound = principle * Math.pow((1+ rate/100), year);
System.out.println("The compound interest is  "+compound);
}
    
}
