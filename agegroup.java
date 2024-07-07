import java.util.Scanner;
public class agegroup
{
public static void main(String args [])
{
Scanner sc = new Scanner (System.in);
System.out.println("Plese ,Enter your age :");
int age = sc.nextInt();
if(age<=13)
System.out.println("you are a :child :");
else if(age<=20)
System.out.println("you are a :teenger");
else if(age<=60)
System.out.println("you are a :adult :");
else if(age>=65)
System.out.println("you are a :senoir");
}
}
