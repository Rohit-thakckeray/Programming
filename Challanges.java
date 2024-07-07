//create a program print the multipllication table for given number //
import java.util.Scanner;
public class Challanges {
public static void main(String args []) {
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to multiplication calculator :");
System.out.println("Enter table number :");
int TableNumber = sc.nextInt();
TablePrint(TableNumber);
}
public static void TablePrint(int num) {
for(int i = 1; i <=10 ; i++)
System.out.println(num +" x " + i + " = " + (num * i));
}
}