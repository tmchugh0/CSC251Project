

   public class Policy{
      
      //private instance variables 
      private int pNumber;
      private String pName; 
      private PolicyHolder policyHolder;
     
      
      //constructor that accepts arguments
      public Policy(int pNumber, String pName, PolicyHolder holder){
         this.pNumber = pNumber;
         this.pName = pName; 
         this.policyHolder = new PolicyHolder(holder);  
               
      //calculate BMI
      }
      public void setPolicyHolder(PolicyHolder holder)
      {
         policyHolder = new PolicyHolder(holder);
      }
      public PolicyHolder getPolicyHolder()
      {
         return new PolicyHolder(policyHolder);
      }
      public double getBMI()
      {
         
         return(policyHolder.getWeight()*703)/(policyHolder.getHeight()*policyHolder.getHeight());
      
      }
      //calculate policy price
      public double getPolicyPrice()
      {
         double policyCost = 0;
         
         int basePrice = 600;
         int addFee = 75;
         int smokerFee = 100;
         
         policyCost = policyCost + basePrice;
         //if statement to see if they are over 50
         if(policyHolder.getAge()>50)
         {
            policyCost = policyCost + addFee;
         }
         //Check if smoker and calculate additional fee
         if(policyHolder.getSmoker().equals("smoker"))
         {
            policyCost = policyCost + smokerFee; 
         
         }
         //Check if BMI is over 35 and calculate 
         if(getBMI() > 35)
         {
            policyCost = policyCost + (getBMI() - 35) * 20;
         
         }
         //return the cost of the policy
         return policyCost;
      
      
      }
      public int getpNumber()
      {
         return pNumber;
      }
      public void setpNumber(int pNumber)
      {
         this.pNumber = pNumber;
      }
      public String getpName()
      {
         return pName;
      }
      public void setpName(String pName)
      {
         this.pName = pName;
      }
      public String toString()
      {
         return String.format("Policy Name: " + pName + "\nPolicy Number: " + pNumber + "\nPolicyHolder's BMI: %.2f"+ "\nPolicy Holder: "+ policyHolder.toString()+"\nPolicy Price: %.2f \n", getBMI(),getPolicyPrice());
         
      }
    }
      
   
   
   
   
   
   
   
   
   
 
   
   
   
   
   
   
