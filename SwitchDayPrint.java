import java.util.Scanner;
public class SwitchDayPrint {
public static void main(String args []) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Week number :");
int WeekNumberInput = sc.nextInt();
switch(WeekNumberInput) {
case 1:System.out.println("monday:");   
       break;
case 2:System.out.println("tuesday:");
       break;
case 3:System.out.println("wednsday:");   
       break;
case 4:System.out.println("thrusday:");
       break;
case 5:System.out.println("friday:");   
       break;
case 6:System.out.println("saturday:");
       break;
case 7:System.out.println("Sunday:");
       break;
default:System.out.println("Invalid week number :");
 }
}
}