import java.util.Scanner ;
import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Project_Tyler_McHugh{

   public static void main(String[] args){
    //try statement to run the code and catch any io exceptions that occur
    try{
      int policyNumber;
      int policyCreated=0;
      String providerName;
      String firstName;
      String lastName;
      int age; 
      String smokingStatus;
      double height;
      double weight; 
      int policySmoker =0;
      int nonPolicySmoker = 0;
      //declare the file and create the scanner 
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      //Scanner keyboard = new Scanner(System.in);
      ArrayList<Policy> policies = new ArrayList<Policy>();
      /*Using a while loop to read input from a file
      *@return policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight
      */
      while(inputFile.hasNext())
      {
         policyNumber = inputFile.nextInt();
         inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
       
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         //using if/else statement to count the number of smoking and non smoking policies
         if(smokingStatus.equals("smoker"))
         {
          policySmoker++;
         }
         else if(smokingStatus.equals("non-smoker"))
         {
            nonPolicySmoker++;
         }
         if(inputFile.hasNext())
         {
            inputFile.nextLine();
            inputFile.nextLine();
         }
         //create the policy and add to the array list 
         PolicyHolder myPolicyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
         Policy policy = new Policy(policyNumber, providerName, myPolicyHolder);
         policies.add(policy);
         policyCreated++;
         
      }
      inputFile.close(); //close the input file 
      //create a for statement to output the data that was read from the file as an array list 
      for(int i = 0; i < policies.size(); i++)
      {
         /*System.out.printf("Policy Number: %d\n", policies.get(i).getpNumber());
         System.out.printf("Provder Name: %s\n", policies.get(i).getpName());
         System.out.printf("Policyholder's First Name: %s\n", policies.get(i).getfName());
         System.out.printf("Policyholder's Last Name: %s\n", policies.get(i).getlName());
         System.out.printf("Policyholder's Age: %d\n", policies.get(i).getAge());
         System.out.printf("Policyholder's Smoking Status: %s\n", policies.get(i).getSmoker());
         System.out.println("Policyholder's Height: " + policies.get(i).getHeight()+ " inches");
         System.out.println("Policyholder's Weight: "  + policies.get(i).getWeight()+ " pounds");
         System.out.printf("Policyholder's BMI: %.2f\n", policies.get(i).getBMI());
         System.out.printf("Policy Price: $%.2f\n", policies.get(i).getPolicyPrice());
         System.out.println();*/
         System.out.println("Policy Information");
         System.out.println(policies.get(i));
         System.out.println();

      
      
      }
 
      
     System.out.println("The number of policies created is: " + policyCreated);
     System.out.println("The number of policies with a smoker is: " + policySmoker);
      System.out.println("The number of policies with a non-smoker is: " + nonPolicySmoker);
      }
      catch(IOException ex)//catches IO exceptions 
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
      
  
      /*System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Smoking Status(smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Height(in inches): ");
      height = keyboard.nextDouble();
      System.out.print("Please enter the Policyholder's Weight(in pounds): ");
      weight = keyboard.nextDouble();
  
      PolicyHolder myPolicyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
      Policy policy = new Policy(policyNumber, providerName, myPolicyHolder);
      policies.add(policy);
     
     
      System.out.printf("Policy Number: %d\n", policy.getpNumber());
      System.out.printf("Provder Name: %s\n", policy.getpName());
      System.out.printf("Policyholder's First Name: %s\n", policy.getfName());
      System.out.printf("Policyholder's Last Name: %s\n", policy.getlName());
      System.out.printf("Policyholder's Age: %d\n", policy.getAge());
      System.out.printf("Policyholder's Smoking Status: %s\n", policy.getSmoker());
      System.out.println("Policyholder's Height: " + policy.getHeight()+ " inches");
      System.out.println("Policyholder's Weight: "  + policy.getWeight()+ " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.getPolicyPrice());
      }
      */
      }
   
    
}
      
