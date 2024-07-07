//Enter any number and will print that spelling//
import java.util.Scanner;
public class Switch_case_numberprint
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter an Integer ");
int number = sc.nextInt();
switch(number)
{
case 0:System.out.println("zero");
       break;
case 1:System.out.println("one");
      break;
case 2:System.out.println("two ");
       break;
case 3:System.out.println("three");
        break;
case 4:System.out.println("four");
      break;
case 5:System.out.println("five");
      break;
case 6:System.out.println("six");
     break;
case 8:System.out.println("eight");
      break;
case 9:System.out.println("nine");
     break;
case 10:System.out.println("ten");
      break;
default:System.out.println("plese enter under 10 number ");
}
}
}