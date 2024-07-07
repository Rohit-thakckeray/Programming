import java.util.Scanner;
public class ArraySerach
{
public static void main(String args [])
{
Scanner sc = new Scanner (System.in);
int [] array = {1,2,3,4,5,6,7,8};
System.out.println("Enter your search key :");
int arrSearch = sc.nextInt();
for(int index = 0; index<8; index ++)
{
if(array[index]==arrSearch)
{
System.out.println("yes element in array :"+arrSearch);
break;
}
}
}
}
