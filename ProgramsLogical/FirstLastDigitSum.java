package ProgramsLogical;
import java.util.Scanner;
class FirstLastDigitSum {
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Input NUmber ");
int n = sc.nextInt();
int lastDigit = 0;
int firstDigit = 0;
int c =0;
//to fetch first digit of number
// lastDigit = input % 10;
while(n>9)
{
firstDigit = n / 10;

lastDigit = n%10;
}
c = firstDigit+lastDigit;

// /input++;
//to fetch last digit number
// lastDigit = input % 10;
System.out.println("First And Last Digit Number is a :" + c );

}
}
