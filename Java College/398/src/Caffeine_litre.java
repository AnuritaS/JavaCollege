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
public class Caffeine_litre {
public static void main(String args[]){
Scanner s = new Scanner(System.in);  
String drink;
int number_drinks;
int time_to_kill;
System.out.println("Enter details");
drink = s.nextLine();
int quantity = s.nextInt();
double caffeine;
double quantity_ounce = quantity*33.814;
double caff_l = 34*(33.814/12);
System.out.println(caff_l);
double quantity_grams = quantity_ounce/28.35;

switch(drink){
    case "Cola":
        caffeine = quantity_grams*(1000/34);
        
        time_to_kill = (int)caffeine/10;
        System.out.println("Drinks of cola taken to kill= "+time_to_kill);
        break;
    case "Coffee":
        caffeine = quantity_grams*(1000/160);
        time_to_kill = (int)caffeine/10;
        System.out.println("Drinks of coffee taken to kill= "+time_to_kill);
        break;
    default:
        System.out.println("Wrong");
}
}


}

