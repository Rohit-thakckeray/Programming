// to take the input from the user and check it is all value divisible by 10 and 20 //
// import java.util.Scanner;
// public class 123
// {
// public static void main(Stringa args [])
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("Enter one value :");
// int inputvalue1 = sc.nextInt();
// System.out.println("Enter second value :");
// int inputvalue2 = sc.nextInt();
// if(inputvalue1  % 10 == 0 && inputvalue2 % 20 == 0)
// System.out.println("disible by 10 or 20 :");
// else
// System.out.println("not divisible :");
// }
// }


//make the one dimestional array and traverse that the array and do if posible any operation//
// public class pract
// {
// public static void main(String args [])
// {
// int array[] = {0,2,3,4,5,2,2,6,4,10,80};
// int evenstore = array[0];
// //traversing of the array 
// for(int traverse = 0; traverse<array.length; traverse ++)
// {
// System.out.println(array[traverse]);
// if(array[traverse] % 2 == 0 )
// {
// evenstore += array[traverse];
// }
// }
// System.out.println("the even number is all sum are a   :" + evenstore);
// }
// }

// make the one condition and try on their ternory operator //
// take the one input from the user and perform that //
// import java.util.Scanner;
// public class pract {    
// public static void main(String args []) {
// Scanner sc = new Scanner(System.in);
// System.out.println("welcome to ternory operator condition statement ");
// System.out.println("Enter the one number :");
// int input1 = sc.nextInt();
// String result = input1 % 2 == 0 ? " EVEN " : "ODD ";
// System.out.println("your number is : " + result );
// } }

// to wap a the program to calculate the profit and loss of the given amount by the user//
// import java.util.Scanner;
// public class pract
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner(System.in);
// System.out.println("Welcome to profit and loss calculator :");
// System.out.println("Enter your Cost price :");
// int costprice = sc.nextInt();
// System.out.println("Enter your cell price :");
// int cellprice = sc.nextInt();
// if(cellprice > costprice)
// System.out.println("your profit is :" + (costprice - cellprice) * (-1));
// else
// System.out.println("your loss is :" + (cellprice - costprice) * (-1));
// }
// }

//wap program to calculate age group of the people //
// import java.util.Scanner;
// public class pract
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner(System.in);
// System.out.println("Welcome to age group calcultor :");
// System.out.println("plese , Tell your age :");
// int ageStore = sc.nextInt();
// if(ageStore < 18)
// System.out.println("tennger");
// else if(ageStore >=18 && ageStore <= 35)
// System.out.println("adult");
// else
// System.out.println("senior");
// }
// }


//to make the one dimestional array and traversing of the array and do some operation for that//
// public class pract
// {
// public static void main(String args [])
// {
// int array[] ={ 0, 2, 3, 4, 5};
// int evennumberStore = array[0];
// //traversing of the array print all elment of the array 
// for(int traverse = 0; traverse<array.length; traverse ++)
// {
// if(array[traverse] % 2 ==0)
// evennumberStore= array[traverse];
// System.out.println("the even number is :" + evennumberStore);
// System.out.println(array[traverse]);
// }
// // System.out.println("the even number is :" + evennumberStore);
// }
// }

// write the program and check if it is a two digit or not number from the user //
// import java.util.Scanner;
// public class pract
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner(System.in);
// System.out.println("welcom to digit check calculator :");
// System.out.println(" ENTER ANY ONCE DIGIT :");
// int inputnumber = sc.nextInt();
// if(inputnumber > 9 && inputnumber <=99)
// System.out.println("two digit number :");
// else
// System.out.println("not two digit number :");
// }
// }


// write the program in java to calculte the compont interset from the user 
// input

import java.util.Scanner;
public class practise
{
public static void main(String args [])
{
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to compound interest calulator :");
System.out.println();
System.out.println("Enter , principle amount :");
int principleAmt = sc.nextInt();
System.out.println("Enter , rate of interest :");
float rateAmt = sc.nextInt();
System.out.println("Enter , period in year :");
float yearAmt = sc.nextInt();

//calculate the compound interest
double result = principleAmt *( 1 + rateAmt / 100) , (yearAmt);
}
}