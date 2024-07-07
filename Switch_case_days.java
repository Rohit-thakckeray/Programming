//print day number and will print which day has on that number//
import java.util.*;
public class Switch_case_days
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter day Number ");
int day_number = sc.nextInt();
switch(day_number)
{
case 1:System.out.println("monday");
       break;
case 2:System.out.println("tuesday");
       break;
case 3:System.out.println("wednsday");
       break;
case 4:System.out.println("thrusday");
      break;
case 5:System.out.println("friday");
      break;
case 6:System.out.println("saturday");
     break;
case 7:System.out.println("sunday");
default:System.out.println("invallid day number");
}
}
}