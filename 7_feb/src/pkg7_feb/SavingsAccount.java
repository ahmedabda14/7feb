/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7_feb;

/**
 *
 * @author ahmed
 */
public class SavingsAccount extends Bank {
 double interestRate;
 double minbalance;
 
 public SavingsAccount(double interestRate,double minbalance){
     this.interestRate=interestRate;
     this.minbalance=minbalance;
 }
 
 public double getminbalance(){
     return minbalance;
 }
 
 public void addinterest(){
     double interest = getbalance()*(interestRate/100);
     deposit(interest);
     
     System.out.println("Interest added: "+interest);
 }
    
}
