//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
   //make an Integer ArrayList called factors
   ArrayList<Integer> factors1 = new ArrayList<Integer>();
   //make a for loop that has a control variable set to 2, while the control variable is less than the number, increment it
   for (int i = 2; i < number; i++)
   {
     //if the number modulus the control variable is equal to 0
     if (number % i == 0)
     {
       //add the variable number to the array list
       factors1.add(i);
     }
   }
   //return the array list
   return factors1; 
 }
 
 public static void keepOnlyCompositeNumbers( List<Integer> nums )
 {
   //make an Integer ArrayList called factors2
   ArrayList<Integer> factors2 = new ArrayList<Integer>();
   //make a for loop with a control variable set to 0, while it is less than the size of the array list, increment it 
   for (int x = nums.size()-1; x > -1; x--)
   {
     //delete all factors in the array list that were saved after checking the last number
     for (int j = factors2.size()-1; j > -1; j--)
     {
       //use the remove method to delete elements
       factors2.remove(j);
     }
     //make a for loop that has a control variable set to 2, while the control variable is less than the x, increment it
     for (int i = 2; i < x; i++)
     {
       //if x modulus the control variable is equal to 0
       if (x % i == 0)
       {
         //add i to factors2
         factors2.add(i);
       }
     }
     //if the size of factors 2 is 0
     if (factors2.size() == 0)
     {
       //remove the number at the position, it is not composite
       nums.remove(x);
     }
   }
 }
  
}