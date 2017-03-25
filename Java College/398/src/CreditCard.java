/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anurita
 */
import java.util.Scanner;
import static java.lang.Math.round;
public class CreditCard {
    Scanner s = new Scanner(System.in);
    double bal, minM =0.00 ,interest = 0.00, un_bal = 0.00;
    double total =0.00;
    double annIR = 0.18/12.0, mnPR = 0.02;
    void getBalance(){
    System.out.println("Enter balance");
    bal = s.nextDouble();
    }
    void calculateInterest(){
        minM = bal * mnPR;
        un_bal = bal - minM;
        interest = annIR * un_bal;
        bal = un_bal + interest;
        total += minM;
    }
    void displayInterestByMonth(int month){
        System.out.println("Month: "+month);
        print("Minimum monthly payment: ",minM);
        print("Remaining Balance: ",bal);
    }
    void displayAnnualPayment(){
        print("Total paid: ",total);
        print("Remaining balance: ",bal);
    }
  void print(String msg, double value){
      System.out.println(msg+round((value*100))/100.0);
  }
    public static void main(String args[]){
        CreditCard bill = new CreditCard();
        bill.getBalance();
        for(int i =1; i<=12; i++){
            bill.calculateInterest();
            bill.displayInterestByMonth(i);
        }
        bill.displayAnnualPayment();
    }
}
