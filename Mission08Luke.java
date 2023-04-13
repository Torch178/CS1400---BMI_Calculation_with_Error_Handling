import java.util.Scanner;
import java.util.InputMismatchException;

public class Mission08Luke
{

   public static void main (String[] args)
   {
   
   //initialize Scanner Object
   
   Scanner in = new Scanner(System.in);
   
   //intialize variables
      
   double heightInput = 0.0;
   double weightInput = 0.0;
   boolean error = false;
   double numerator = 0.0;
   double denominator = 0.0;
   double bmi = 0.0;
   
   
   
   /*******Part 1******************************
   ********Collect Valid Input****************/
   
   //Prompt user for height input
   
   System.out.println("Enter height in inches: ");
   
   //Check for valid height input

   do
   {
   
      try
      {
         error = false;
         heightInput = in.nextDouble(); 
         
         //check for a negative value
         while (heightInput <= 0)
         {
            error = true;
            System.out.println("Invalid inches value. Must be a positive value.");
            System.out.println("Re-enter height in inches: ");
            
            //Flush the buffer
            in.nextLine();
            
            //break out of while loop
            break;
            
         }//end of negative value while loop
       
      }
      
      
      catch (InputMismatchException e)
      {
         error = true;
         System.out.println("Invalid inches value. Must be a decimal number.");
         System.out.println("Re-enter height in inches: ");
         
         //Flush the buffer
         in.nextLine();
      }
      
         
   }while(error);
   //end of height do/while loop
   
   
   //Prompt user for weight
   System.out.println("Enter weight in pounds: ");
   
   //check for valid weight input
   do
   {
   
      try
      {
         error = false;
         weightInput = in.nextDouble();  
         
         while (weightInput <= 0)
         {
            error = true;
            System.out.println("Invalid pounds value. Must be a positive value.");
            System.out.println("Re-enter weight in pounds: ");
            
            //Flush the buffer
            in.nextLine();
            
            //break out of while loop
            break;
            
         }//end of negative value while loop

      }//end of try
      
      
      catch (InputMismatchException e)
      {
         error = true;
         System.out.println("Invalid pounds value. Must be a decimal number.");
         System.out.println("Re-enter weight in pounds: ");
         
         //Flush the buffer
         in.nextLine();
         
      }//end of catch
      
        
   }while(error);
   //end of weight do/while loop
   
   
   /*****Part 2**************************************
   ******Calculate BMI and output final results*****/
   
   //Perform BMI calculations
   
   numerator = (704*weightInput);
   denominator = (heightInput * heightInput);
   bmi = numerator / denominator;
   
   //Output final results
   
   System.out.println("Height = " + heightInput + "\"");
   System.out.println("Weight = " + weightInput + " pounds");
   System.out.println("Body mass index = " + bmi);


   }//end of main method


}//end of program