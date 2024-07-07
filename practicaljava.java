// example of bitwise and operator 
// import java.util.Scanner;
// public class practicaljava
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("welcome , to bitwise casting of and bitwise and operator");
// System.out.println("Enter once number :");
// int input = sc.nextInt();
// System.out.println("Enter second number :");
// int input1 = sc.nextInt();
// System.out.println("final result is :" + (input & input1));
// }
// }

//example of bitwise or opeartor 
// import java.util.Scanner;
// public class practicaljava
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner(System.in);
// System.out.println("Welcome to casting bitwise or opearator :");
// System.out.println("Enter first value :");
// int input1 = sc.nextInt();
// System.out.println("Enter second value :");
// int input2 = sc.nextInt();
// System.out.println("the final result of bitwise or is  a :" + (input1 | input2));
// }
// }



//example of bitwise xor operator 
// import java.util.Scanner;
// public class practicaljava
// {                                                        
// public static void main(String args [])
// {
// Scanner sc = new Scanner(System.in); 
// System.out.println("WElcome to bitiwse xor opeartor :");
// System.out.println("tell first value :");
// int input1 = sc.nextInt();
// System.out.println("Tell second value :");
// int input2 = sc.nextInt();
// int result = input1 ^ input2;
// System.out.println ("final result of bitwise x or opearator is :" + result);
// }
// }


//example of bitwise complement opeartor 
import java.util.Scanner;
public class practicaljava
{
public static void main(String args [])
{
Scanner sc = new Scanner(System.in);
System.out.println("welcome to casting of bitwise complement :");
System.out.println("Tell first value :");
int inputvalue1 = sc.nextInt();
System.out.println("Enter second value :");
int inputvalue2 = sc.nextInt();
int resultvalueshow = (inputvalue1 ~ inputvalue2 );
System.out.println("Final result is :" + (resultvalueshow));
}
}