import java.util.Scanner;
public class SwapFunction {
 
public static void Swap(int a, int b) {
    int temp;
    temp = a;
    a = b;
    b = temp;
    System.out.println();
    System.out.println("After swapping value is :"+ a +" "+b);
}
public static void main(String args []) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter first value :");
int a = sc.nextInt();
System.out.println("Enter second value :");
int b = sc.nextInt();
System.out.println();
System.out.println();
System.out.println("before swappin value is :"+ a +" "+b);
System.out.println();
Swap(a,b);

}

  }
