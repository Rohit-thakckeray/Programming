// one dimestional array program basic operation //
import java.util.Scanner;
public class ArrayProgram
{
public static void main(String args [])
{
//input scanner class
Scanner sc = new Scanner(System.in);

// array decleration and intilization 
int array [] = { 10 , 20 , 3 , 5 , 50};


//traversing of the array  .. and print all element from the array //
for( int traverse = 0; traverse<array.length; traverse ++)
{
System.out.println(array[traverse]);
}

//sum of all the element in the array 
int sum = 0 ;
for( int traversing = 0; traversing < array.length; traversing ++)
{
sum += array[traversing];
}
System.out.println();
System.out.println("THE SUM OF THE ALL THE ELEMENT IS :" +   sum);
System.out.println();

//fint the maximum value in the whole array 
int maxValueStore = array[0];
for( int travling = 0 ; travling < array.length; travling ++)
{
if(array[travling] > maxValueStore)
maxValueStore = array[travling];
}
System.out.println("max value is from the array is :" + "   " + maxValueStore);
System.out.println();

//find the element from user and check is present in array or not
System.out.println("Enter once elemet for find in array :" );
int findElementArray = sc.nextInt();
for( int searcharray = 0; searcharray < array.length; searcharray ++)
{
if(array[searcharray] == findElementArray)
{
System.out.println("present element in the array :");
break;
}
else if(array[searcharray] != findElementArray)
{
System.out.println("not , present elment in array :");
break;
}
}






//print the all even number from the given array 



//print the all odd number from the given array 
}
}