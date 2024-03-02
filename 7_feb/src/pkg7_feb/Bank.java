/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7_feb;

/**
 *
 * @author ahmed
 */
public class Bank  {
   private double salary;
    private String name;
    private String accountnum;
    
  public Bank(){
salary=1000.00;
name="";
accountnum="";
  }  
  public Bank(double salary,String name, String accountnum){
      this.salary=salary;
      this.accountnum=accountnum;
      this.name=name;
  }
  
  public void withdrawal (double amount){
      if (amount>0&&amount<=salary){
          salary -=amount;
      }
      else{
          System.out.println("Not enough funds");
      System.exit(0);
      }
  }
  public void deposit(double amount){
      if (amount>0){
          salary+=amount;
      }
  }
  public double getbalance(){
      return salary;
  }
  public String getaccountnum(){
      return accountnum;
      
  }
  public String getname(){
  return name;
  }
  
  public void display(){
      System.out.println("name of holder: "+name+" accountnum: "+accountnum+" Balance"+salary);
  }
  public static void main (String[] Args){
        Bank client1 = new Bank();
    client1.display();
    client1.deposit(100.34);
    client1.display();
  
    SavingsAccount c1 = new SavingsAccount(5,2000);
    c1.deposit(0);
    c1.addinterest();
    c1.display();
  }
}
