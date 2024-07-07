//if the ages of ram and ajay and rohit are given by input and 
//wap to program determine the who is more youngest that print//\
import java.util.Scanner;
public class young_age
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first ram age :");
double ram_age = sc.nextDouble();
System.out.println("Enter the ajay ages :");
double ajay_age = sc.nextDouble();
System.out.println("Enter the rohit age :");
double rohit_age = sc.nextDouble();
//logic of young 
if(ram_age<ajay_age && ram_age<rohit_age)
{
System.out.println("this Ram  man is youngest "+ram_age);
}
else if(ajay_age<ram_age && ajay_age<rohit_age)
{
System.out.println("This Ajay is man is youngest "+ajay_age);
}
else if(rohit_age<ram_age && rohit_age<ajay_age)
{
System.out.println("This Rohit is man is youngesr "+rohit_age);
}
if(ram_age == ajay_age && rohit_age==ram_age && rohit_age == ram_age && rohit_age == ajay_age && ajay_age ==ram_age &&ajay_age==rohit_age && ram_age==rohit_age && rohit_age==ram_age)
{
System.out.println("all are same age :");
}
}
}
