package ProgramsLogical;
import java.util.Scanner;
public class LastDigitNumber {
 public static void main(String [] args )
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter USer Input :");
int inputnumber = sc.nextInt();
int LastdigitNumber = inputnumber %10;
System.out.println("Last digit of given number is a :" + LastdigitNumber);
}
    
}
