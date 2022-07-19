//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods
class Account{
int acc_no;
String name;
float amount;
void insertRecord(int a,String n, float amt)
{
    acc_no = a;
    name = n;
    amount = amt;
}
//deposit method
void deposit(float amt){
    amount = amount +amt;
    System.out.println(amt+" deposited");
}
void withdraw(float amt){
     if (amount<amt)
     {
      System.out.println("insufficient balance");
     }
     else{
        amount=amount - amt;
        System.out.println(amt +"withdrawn");
     }
}
void checkBalance()
    {
        System.out.println("available balance :" +amount);
    }
void displayInfo()
{
System.out.println("name :" + name +" Account number : "+acc_no+" available balance " +amount);
}
}
// test class to deposit and withdraw amount
class TestAccount{
    public static void main(String args[])
    {
     Account a1 = new Account();
     a1.insertRecord(95342,"chkr",25000);
     a1.displayInfo();
     a1.checkBalance();
     a1.deposit(45000);
     a1.checkBalance();
     a1.withdraw(10000);
     a1.checkBalance();
     a1.displayInfo();
    
    }
}