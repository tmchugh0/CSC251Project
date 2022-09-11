import java.util.Scanner ;

public class Project_Tyler_McHugh{

   public static void main(String[] args){
      
      int policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age; 
      String smokingStatus;
      double height;
      double weight; 
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Please enter the Policy Number: ");
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
      
      
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
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
}
      
