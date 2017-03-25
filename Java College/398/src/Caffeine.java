
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
public class Caffeine {
public static void main(String args[]){
Scanner s = new Scanner(System.in);  
String drink;
int number_drinks;
int time_to_kill;
System.out.println("Enter details");
drink = s.nextLine();
number_drinks = s.nextInt();
int quantity = 12*number_drinks;
double caffeine = 0.0;
double quantity_grams = quantity/28.35;
switch(drink){
    case "Cola":
        caffeine = quantity_grams*(1000/34);
        break;
    case "Coffee":
        caffeine = quantity_grams*(1000/160);
        break;
    default:
        System.out.println("Wrong");
}
 time_to_kill = (int)caffeine/10;
        System.out.println("Drinks of "+drink+" taken to kill= "+time_to_kill);
}


}

