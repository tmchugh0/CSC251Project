public class PolicyHolder
{
   private String pNumber;
   private String pName;
   private String fName;
   private String lName;
   private int pAge; 
   private String smoker;
   double pHeight;
   double pWeight;
   
    public PolicyHolder(String firstName, String lastName, int age, String areSmoker, double height, double weight)
    {
      fName = firstName;
      lName = lastName;
      pAge= age;
      smoker = areSmoker;
      pHeight = height;
      pWeight = weight;
    }
    
    public PolicyHolder(PolicyHolder object2)
    {
      fName = object2.fName;
      lName = object2.lName;
      pAge = object2.pAge;
      smoker = object2.smoker;
      pHeight = object2.pHeight;
      pWeight = object2.pWeight;
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
      public String toString()
      {
         return String.format("Policyholder's First Name: " + fName + "\nPolicyholder's Last Name: " + lName+ "\nPolicyholder's Age: " + pAge + 
         "\nPolicyholder's Smoking Status: "+smoker+"\nPolicyholder's Height: " + pHeight + " inches" + "\nPolicyholder's Weight: " + pWeight + " pounds");

      }




}