class SavingsAccount {
    
    static float interestRate;

    int accountNo;
    String name;
    double balance;

   
   static void modifyIntrate(float newRate) {
       interestRate = newRate;
   }

    SavingsAccount(int accNo, String accName, double accBalance) {
       accountNo = accNo;
       name = accName;
       balance = accBalance;
   }

    double calculateInterest(int period) {
       return balance * interestRate * period / 100;
   }

   
   void displayDetails(int period) {
       System.out.println("Account No: " + accountNo);
       System.out.println("Name: " + name);
       System.out.println("Balance: " + balance);
       System.out.println("Interest for " + period + " year(s): " + calculateInterest(period));
   }

  
   public static void main(String[] args) {
       
       SavingsAccount.modifyIntrate(5.0f);

       
       SavingsAccount acc1 = new SavingsAccount(101, "Alice", 10000.0);
       acc1.displayDetails(1);
 
       SavingsAccount.modifyIntrate(6.0f);

       SavingsAccount acc2 = new SavingsAccount(102, "Bob", 10000.0);
       acc2.displayDetails(1);
   }
}