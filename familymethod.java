public class familymethod
{
public static void main(String args [])
{
int array [] ={90,234,345,99,45};
int maxValueStore = array [0];
int maxValueStore2 = array[0];
int minValueStore = array[0];
boolean falg;
//traversing of all the whole array who is big value 
//code for who is max value from 1 to 10 //
for(int travers = 0; travers < array.length; travers ++)
{
//max value should be 1 digit 
if(array[travers] > 1 && array[travers] <10) //until value is greter 1 and less than 10 then true
if(array[travers] > maxValueStore) // if true
if(maxValueStore < 10) //if any is max under the 10th value that will execute 
{
 boolean flag = true;
maxValueStore = array[travers];
break;
}
}

//code for who is max value from 10 to 100 //
 for(int traverse1 = 0; traverse1 < array.length; traverse1 ++)
{
 if(array[traverse1]  > 10 && array[traverse1] < 100)
if(array[traverse1] > maxValueStore2)
{
boolean flag = false;
maxValueStore2 = array[traverse1];
 } 
}
  System.out.println("max value is between 1 to 10  : " +maxValueStore );// 1 to 10 max 
  System.out.println("max value between 10 to 100 : " + maxValueStore2); //10 to 100 max

// try to check who is minimum value from 1 to 500 //
for(int traverse2 = 0; traverse2 <array.length; traverse2 ++)
{
if(array[traverse2] >= 1 && array[traverse2] <= 500)
if(array[traverse2] < minValueStore)
if(array[traverse2] <=500 )
{
falg = false;
minValueStore = array[traverse2];
}
}
System.out.println("the min value from 1 to 500 is : " + minValueStore);

}
}