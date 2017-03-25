/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anurita
 */
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
public class Debt {
    Scanner s = new Scanner(System.in);
    double bal ,bal1, interest = 0.00, un_bal = 0.00;
    double total =0.00;
    double monIR = 0.18/12.0, monPR = 10.0;
    
    void getBalance(){
    System.out.println("Enter balance");
    bal = s.nextDouble();
    bal1 = bal;
    }
    
    void calculateBal(){
        un_bal = bal - monPR;
        interest = monIR * un_bal;
        bal = un_bal + interest;
        
    }
    /*void displayInterestByMonth(int month){
        System.out.println("Month: "+month);
        print("Remaining Balance: ",bal);
    }
    void displayAnnualPayment(){
        print("Total paid: ",total);
        print("Remaining balance: ",bal);
    }*/
    void displayLowestPayment(){
        
        print("Lowest Payment: ",monPR);
    }
    
  void print(String msg, double value){
      System.out.println(msg+round((value*100))/100.0);
  }
  
    public static void main(String args[]){
        Debt bill = new Debt();
        bill.getBalance();
        int j = 1;
       while( bill.bal > 0.0 ){
        bill.monPR = j*10.0;
        bill.bal = bill.bal1;
        j++;
        for(int i =1; i<=12; i++){
            bill.calculateBal();
             //bill.displayInterestByMonth(i);
        }
       }
             
        
         bill.displayLowestPayment();
         //bill.displayAnnualPayment();
    }
}
