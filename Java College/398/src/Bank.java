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
public class Bank{
Scanner s = new Scanner(System.in);
int acc_no;
String name;
String acc_type;
double bal;
void setData(){
acc_no = s.nextInt();
name = s.nextLine();
acc_type = s.nextLine();
bal = 0.0;
}
void deposit(){
double deposit = 0.0;
System.out.println("Enter deposit");
deposit = s.nextDouble();
bal += deposit;
}
void displayBal(){
System.out.println("Balance is=“"+bal);
}
}
class savings extends Bank{
double rate = 0.0;
double time = 0.0;
void interest(){
    double interest = bal * Math.pow((1 + rate/100),time); 
    bal += interest;
}
void withdrawal(){
    double amt;
    System.out.println("Enter withdrawal amount");
    amt= s.nextDouble();
    bal -= amt;
}
}
class current extends savings{
void checkBal(){
    double fine = 0.0;
if(bal < 5000.0){
    fine = 0.05 * bal;
    bal -= fine;
        }
}
public static void main(){
    current obj = new current();
    obj.setData();
    obj.deposit();
    obj.displayBal();
    if(obj.acc_type.equalsIgnoreCase("savings")){
      obj.interest();
      obj.withdrawal();
    }
    else{
    obj.checkBal();
    }
}
}