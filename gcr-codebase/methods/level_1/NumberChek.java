// Java program to number chek

import java.util.Scanner;

public class NumberChek{
       // writting methid to check number

       static int numberIs(int number){

        // checking the number and returning
       if(number>0){
          return 1;
       } else if(number<0){
       return -1;
       }
       else return 0;
       }

      
      public static void main(String[] args){
           //creating scanner object
          
       Scanner input = new Scanner(System.in);
         
        // take user input
        int number = input.nextInt();
       
        //calling and printing 

       System.out.println(numberIs(number));
       
        

}
}