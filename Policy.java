

   public class Policy{
      
      //private instance variables 
      private int pNumber;
      private String pName; 
      private String fName; 
      private String lName;
      private int pAge; 
      private String smoker;
      double pHeight;
      double pWeight;
      
      //constructor that accepts arguments
      public Policy(int pNumber, String pName, String fName, String lName, int pAge, String smoker, double pHeight, double pWeight){
         this.pNumber = pNumber;
         this.pName = pName;   
         this.fName = fName;
         this.lName = lName;
         this.pAge = pAge;
         this.smoker = smoker;
         this.pHeight = pHeight;
         this.pWeight = pWeight;
      
      //calculate BMI
      }
      public double getBMI()
      {
         return(pWeight*703)/(pHeight*pHeight);
      
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
         if(pAge>50)
         {
            policyCost = policyCost + addFee;
         }
         //Check if smoker and calculate additional fee
         if(smoker.equals("smoker"))
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
      public String getfName()
      {
         return fName;
      }
      public void setfName(String fName)
      {
         this.fName = fName;
      }
      public String getlName()
      {
         return lName;
      }
      public void setlName(String lName)
      {
         this.lName = lName;
      }
      public int getAge()
      {
         return pAge;
      }
      public void setAge(int pAge)
      {
         this.pAge = pAge;
      }
      public String getSmoker()
      {
         return smoker;
      }
      public void setSmoker(String smoker)
      {
         this.smoker = smoker;
      }
      public double getHeight()
      {
         return pHeight;
      }
      public void setHeight(double pHeight)
      {
         this.pHeight = pHeight;
      }
      public double getWeight()
      {
         return pWeight;
      }
      public void setWeight(double pWeight)
      {
         this.pWeight = pWeight;
      }
      }
      
   
   
   
   
   
   
   
   
   
 
   
   
   
   
   
   
