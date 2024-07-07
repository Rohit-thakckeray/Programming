import java.util.Scanner;
public class FirstDigit
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Your User Input :");
int inputNumber = sc.nextInt();
while(inputNumber > 9)
inputNumber = inputNumber / 10;
System.out.println();
System.out.println("your input First digit is a :" + inputNumber);
}
}
