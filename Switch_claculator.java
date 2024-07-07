import java.util.Scanner;
public class Switch_claculator
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("-----------------------------------------");
System.out.println("\n");
System.out.println("1 :Addition");
System.out.println("2 :substraction");
System.out.println("3:multiplication");
System.out.println("4:substaraction");
System.out.println("5:remindor");
//System.out.println("\n");
System.out.println("\n Enter you choise ");
int choise = sc.nextInt();
switch(choise)
{
case 1:System.out.println("Enter first value ");
        int a = sc.nextInt();
        System.out.println("Enter second value ");
        int b = sc.nextInt();
        int finala = a + b;
        System.out.println("Addition  is "+finala);
        break;
case 2:System.out.println("Enter first value ");
       a = sc.nextInt();
       System.out.println("Enter second value ");
       b = sc.nextInt();
       finala = a - b;
       System.out.println("the substraction is "+finala);
       break;
case 3:System.out.println("Enter first value ");
       a = sc.nextInt();
       System.out.println("Enter second value ");
       b = sc.nextInt();
       finala = a * b;
       System.out.println("the multiplication is "+finala);
       break;
case 4:System.out.println("Enter first value ");
       a = sc.nextInt();
       System.out.println("Enter second value ");
       b = sc.nextInt();
       finala = a / b;
       System.out.println("the division is "+finala);
        break;
case 5:System.out.println("Enter first value  ");
       a = sc.nextInt();
       System.out.println("Enter second value ");
       b = sc.nextInt();
       finala = a % b;
       System.out.println("the remindor is "+finala);
default:System.out.println("INVALID CHOISE ");
}

}
}