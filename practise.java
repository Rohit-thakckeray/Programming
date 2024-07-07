// to take three positive value and verfiy that and return max value among them //
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("Tell first value :");
// int inputvalue1 = sc.nextInt();
// System.out.println("Tell second value :");
// int inputvalue2 = sc.nextInt();
// System.out.println("Tell third value :");
// int inputvalue3 = sc.nextInt();
// if(inputvalue1 > inputvalue2)
// {
// if(inputvalue1 > inputvalue3)
// {
// System.out.println("max value is :"+inputvalue1);
// }
// }

// if(inputvalue2 > inputvalue1)
// {
// if(inputvalue2 > inputvalue3)
// {
// System.out.println("Max value is :"+inputvalue2);
// }
// }

//  if(inputvalue3 > inputvalue1)
// {
// if(inputvalue3 > inputvalue2)
// {
// System.out.println("Max value is :"+inputvalue3);
// }
// }
// }
// }

//take a one number from the user and verify that what is that positive negative or zero that and return accourding that //
// import java.util.Scanner;
// public class practise
// {
// public static void main(String [] args )
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("Tell Any Single Number :");
// int inputinteger = sc.nextInt();
// if(inputinteger > 0 )
// System.out.println("The Number is positive :"+inputinteger);
// else if (inputinteger < 0) 
// System.out.println("The Number is negative :"+inputinteger);
// else
// System.out.println("The number is Zero :"+inputinteger);
// }
// }

// to wap program to check whether number is divisible 5 and 11 or not and return accroundig that //
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("Enter a Number :");
// int num = sc.nextInt();
// if(num % 5 ==0 && num % 11 == 0 )
// System.out.println("The Number is divisible by 5 and 11 :"+num);
// else
// System.out.println("Not divisible by 5 And 11 :"+num);
// }
// }

// Write a program take number and verify is   odd or even number and return //
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a value :");
// int isOddEven = sc.nextInt();
// if(isOddEven % 2 ==0 )
// System.out.println("Even number :");
// else
// System.out.println("Odd number :");
// }
// }

//write a program odd or even using bitwise and operator //
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("Enter a value :");
// int isEvenOdd = sc.nextInt();
// if((isEvenOdd & 1)==0)
// System.out.println("Even number :");
// else
// System.out.println("Odd number :");
// }
// }
//Write a program is 3 digit number or not //
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("Enter any integer :");
// int is3Digit = sc.nextInt();
// if( is3Digit >99 && is3Digit < 1000)
// System.out.println("The Number is Three digit 3 :"+is3Digit);
// else
// System.out.println("Number is Not 3 Digit :"+is3Digit);
// }
// }
//Write a program is if number is 2 digit  and between 99 and start from 50 then return yes conform otherwise not found //
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("Enter a Any integer :");
// int is2Digit = sc.nextInt();
// if(is2Digit<9)
// System.out.println("number is not two digit :"+is2Digit);
// if(is2Digit >2)
// {
// if(is2Digit >50 && is2Digit <=99)
// {
// System.out.println("Yes Number is 2 Digit and start from 50 and between the 99 :"+is2Digit);
// }
// else
// {
// System.out.println("this is 2 digit but not under 99 and upper 50 :");
// }
// }
// }
// }


//write a program is 4 digit number or not //
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("Enter any integer :");
// int is4DigitNum = sc.nextInt();
// if(is4DigitNum > 999 && is4DigitNum < 10000)
// System.out.println("Number is 4 Digit :"+is4DigitNum);
// else
// System.out.println("Number is not 4 Digit :"+is4DigitNum);
// }
// }
//write a program is 1 dig or not //
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("Ente any Integer :");
// int is1DigitNum = sc.nextInt();
// if( is1DigitNum < 10 )
// System.out.println("number is ONE 1 Digit :"+is1DigitNum);
// else
// System.out.println("Not an ONE Digit value :"+is1DigitNum);
// }
// }
//write a program and take one number and and check is it absolute value and return //
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("Enter an Integer :");
// int isAbsolutevalue = sc.nextInt();
// if( isAbsolutevalue > 0 )
// System.out.println("The Absolute value is " +isAbsolutevalue);
// else
// {
// isAbsolutevalue = isAbsolutevalue * (-1);
// System.out.println("The Absolute value is " +isAbsolutevalue);
// }
// }
// }

//write a program to check is alphbate characte or not //
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("Enter any a Character :");
// char isAlphabateChar = sc.next().charAt(0);
// if( isAlphabateChar >= 'a' && isAlphabateChar <= 'z')
// System.out.println("Alphabate character :"+ " = " +isAlphabateChar);
// else
// System.out.println("Not Alphabate character :"+ " = " +isAlphabateChar);
// }
// }

// wtite a check a aplphabate is it vowel or not //
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("Enter an Any Alphabate :");
// char isVowel = sc.next().charAt(0);
// if(isVowel == 'a' || isVowel == 'e' || isVowel == 'i' || isVowel == 'u' || isVowel == 'A' || isVowel == 'E' || isVowel == 'O' || isVowel == 'I' || isVowel == 'U')
// System.out.println("Vowel character :");
// else
// System.out.println("Not Vowel character :");
// }
// }

// write a program to and input any character and check whether it is alphabate or digit or special charcater that check..
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("Enter Any Character :");
// char ischar = sc.next().charAt(0);
// if(ischar >= 'a' && ischar<= 'z' )
// System.out.println("Alphabate character :"+ischar);
// else if( ischar >='0' && ischar <= '9')
// System.out.println("numeric value mean digit "+ischar);
// else
// {
// System.out.println("Specail Character :"+ischar);
// }
// }
// }

//write a program to check whether it is uppercase or lowercase character //
// import java.util.Scanner;
// public  class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("Enter Any Character :");
// char isUpperLower = sc.next().charAt(0);
// if(isUpperLower >= 'A' && isUpperLower <= 'Z')
// System.out.println("Upercase Character :"+isUpperLower);
// else
// System.out.println("Lowercase Character :"+isUpperLower); 
// }
// }


//write a program to input week number and print week day (using if else else if ladder)..//
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Week Number :");
// int WeekNumber = sc.nextInt();
// if(WeekNumber == 1)
// System.out.println("monday :");
// else if(WeekNumber == 2 )
// System.out.println("Tuesday :");
// else if(WeekNumber == 3)
// System.out.println("wednsday :");
// else if(WeekNumber == 4)
// System.out.println("thrusday :");
// else if(WeekNumber == 5 )
// System.out.println("friday :");
// else if(WeekNumber == 6 )
// System.out.println("saturday :");
// else if(WeekNumber == 7 )
// System.out.println("Sunday:");
//else 
//System.out.println("invalid week number :");
// }
// }


//write a program to input week number and print week day .(using Switch case )..//
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("Enter week number :");
// int weeknumber = sc.nextInt();
// switch(weeknumber)
// {
// case 1 :System.out.println("monday");
//         break;
// case 2 :System.out.println("Tuesday");
//         break;
// case 3:System.out.println("wednsday");
//         break;
// case 4:System.out.println("thrusday");
//        break;
// case 5:System.out.println("friday");
//        break;
// case 6:System.out.println("saturday");
//        break;
// case 7:System.out.println("sunday fun day");
//        break;
// default:System.out.println("invalid week number :");
// }
// }
// }

// write a program and inputa all side of triangle and check whether it is triangle valid or not//
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("Enter first side of of the Triangle 1   : ");
// int angle1 = sc.nextInt();
// System.out.println("Enter second side of the Triangle   2    :");
// int angle2 = sc.nextInt();
// System.out.println("Enter third side of the triangle is  3   :");
// int angle3 = sc.nextInt();
// int angleSum = angle1 + angle2 + angle3;
// if(angleSum == 180 && angle1 > 0  && angle2 > 0 &&  angle3 >0)
// System.out.println("Valid triangle is =:"+angleSum);
// else
// System.out.println("Invalid Traingle :");
// }
// }

//write a program and calculate the profit and loss and return accouring that //
// import java.util.Scanner;
// public class practise {
// public static void main(String args []) {
// Scanner sc = new Scanner (System.in);
// System.out.println("Enter the Cost price :");
// int CostPrice = sc.nextInt();
// System.out.println("Enter the Cell price :");
// int CellPrice = sc.nextInt();
// if(CellPrice > CostPrice)
// System.out.println("the profit is a :" + (CellPrice - CostPrice));
// else if(CostPrice > CellPrice )
// System.out.println("The loss is :" + (CostPrice - CellPrice));
// else
// System.out.println("No profir or no Loss :");
// }
// }

// create a program and calculate the multiplication of table of given number //
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner (System.in);
// System.out.println("Welcome to multiplication table's calculator :");
// System.out.println("Enter the value :");
// int StoreValue = sc.nextInt();
// MultiplicationTablePrint(StoreValue);
// }
// public static void MultiplicationTablePrint(int num)
// {
// for(int index = 0; index<=10; index++)
// {
// System.out.println(num + "x"  + index + " = " + (num * index));
// }
// }
// }


// create a program and calculate the all till that sum of all odd number and return that value//
// import java.util.Scanner;
// public class practise 
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the Number :");
// int sum = sc.nextInt();
// SummOddNumber(sum);
// System.out.println("The total number of Odd sum is "+sum);
// }
// public static int SummOddNumber(int num)
// {
// int i = 1;
// int sum = 0;
// while(i<=num)
// {
// sum = sum + i;
// i = i + 2;
// }
// return sum;
// }
// }

// create the one dimestional array and check is it present in the array even if is it then return 
// and return the odd number from the user gievn array

// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner (System.in);
// int array [] = { 2,3,4,7,7,4,345};
// int EvenStore = array[0];
// int OddStore = array[0];
// //traverse of the array 
// for(int traverse = 0; traverse <array.length; traverse ++)
// {
// if(array [traverse ] % 2 ==0 )
// {
// EvenStore = array[traverse];
// System.out.println("Even number is " + EvenStore);
// }
// else
// {
// OddStore = array[traverse];
// System.out.println("Odd number is " + OddStore);
// }
// }
// }
// }


// make the one dimestional array and traversing the array and check even or odd number
// and print that and also check how many element are there present in the array counting array 
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner(System.in);
// //array decleration 
// int array [] = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8,5,6,4,5,6,7,5};
// //varible decleration
// int evenStoreVariable = array[0];
// int oddStorevariable = array[0];
// //count number varible decleration 
// int count = 0;
// //sum store varible decleration 
// int sum = 0;
// //traversing the array 
// // search element in the array 
// int searchkey = 0;
// for(int traverse = 0; traverse < array.length; traverse ++)
// {
// count++;
// if(array[traverse] % 2 ==0)
// {
// evenStoreVariable = array[traverse];
// System.out.println();
// System.out.println("even number " + evenStoreVariable);
// }
// else
// {
// oddStorevariable = array[traverse];
// System.out.println();
// System.out.println("odd number " + oddStorevariable);
// }
// }
// System.out.println("the total number of element in the array is :" + count);

// // here is code of sum of the all the element in the present in the array 
// int travling;
// for(travling = 0; travling <array.length; travling ++)
// {
// sum =+ array[travling];
// }
// System.out.println("the sum is all element is :" + travling);
// for(int search =0; search<array.length; search ++)
// {
// if(array [search] == searchkey)
// {
// searchkey=array[search];
// }
// else
// {
// System.out.println();
// }
// }
// }
// }

// print the all even number from 1 to 100 //
// public class practise
// {
// public static void main(String args [])
// {
// for( int print = 2; print <=100; print ++ )
// {
// if(print % 2 !=0)
// System.out.println(print);
// System.out.println();
// }
// }
// }

//print the table of 19 //
// public class practise
// {
// public static void main(String args [])
// {
// for(int table = 1; table <= 10; table ++)
// {
// System.out.println(table*19);
// }
// }
// }

// make the one program for table print and print that 
// table whatever user want 
// import java.util.Scanner;
// public class practise
// {
// public static void main(String args [])
// {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter which table print :");
// int inputTable = sc.nextInt();
// for(int traversetable = 1; traversetable <=10; traversetable ++)
// System.out.println(inputTable * traversetable);
// // System.out.println();
// }
// }


// one input from the user how many odd number should be print and print that all number 

// write the program in java to check given number is prime number or not //
// i

//write the program in java swap of two number program and given value form the user inuput//
import java.util.Scanner;
public class practise
{
public static void main(String args [])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter once number :");
int inputvalue1 = sc.nextInt();
System.out.println("Enter second number :");
int inputvalue2 = sc.nextInt();
System.out.println("Before swapping value is :" + inputvalue1 + "   "  +inputvalue2);
// way first by using third varaible 
// int tempvarible;
// tempvarible = inputvalue1;
// inputvalue1 = inputvalue2;
// inputvalue2 = tempvarible;


//way second by using plus and minus without using third variable //
inputvalue1 = inputvalue1 + inputvalue2;
7 inputvalue1 = inputvalue1 + inputvalue2;
inputvalue2 = inputvalue2 - inputvalue1;
System.out.println();
System.out.println("After swapping a value is :" + inputvalue1  + "   "  + inputvalue2);
}
}