
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anurita
 */
public class Directory {
public static void main(String args[]){
Scanner s = new Scanner(System.in); 
String name[] = {"adi","anu","bhanu","sarvo","yaani"};
int number[] = {398,340,073,276,888};

System.out.println("Enter name to search");
String s_name = s.next();
for(int x = 0; x < 5; x++){
    if(s_name.equals(name[x])){
        System.out.println("Number is "+number[x]);
        return;
    }
}
}
}
