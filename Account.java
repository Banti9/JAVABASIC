public class Account {
    
}
// What will be the output of the following code?
 class Account {
     abstract void deposit();
     }
      class SavingAccount extends Account { 
        void deposit() { 
            System.out.println("Deposit Call"); 
        } 
        public static void main(String args[]) {
             SavingAccount obj=new SavingAccount();
              obj.deposit(); }
             }