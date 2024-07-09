package ProgramsLogical;
import java.util.Scanner;
public class FirstDigitNumber {
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Your Input Number  :" );
int input = sc.nextInt();
while(input>=10)
{
input = input/10;
}
System.out.println("First number is a of Given number isa   :"  + input);
}
}
