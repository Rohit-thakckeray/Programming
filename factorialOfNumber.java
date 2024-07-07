import java.util.Scanner;
public class factorialOfNumber {
public static void main(String args []) {
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to factorail  calculator :");
System.out.println("Enter your Number :");
int FactorailInputValue = sc.nextInt();
int showFactorail = FactorailCalculate(FactorailInputValue);
System.out.println("Factorail number is :"+showFactorail);
}
public static int FactorailCalculate(int num) {
int i =1;//for while loop intilization 
int fact = 1;//factoraial varible store the value and calculte them 
while(i<=num) {
fact= fact * i;
i = i + 1;
}
return fact;
}
}