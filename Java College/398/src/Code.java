
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
public class Code {
    public static void main(String args[]){
Scanner s = new Scanner(System.in);  
String numbers;
String coded_numbers = "";
System.out.println("Enter numbers");

numbers = s.nextLine();
int l = numbers.length();
    char first_no = numbers.charAt(0);
    char last_no = numbers.charAt(l-1);
    
    
    if(first_no % 2 == 0 && last_no %2 == 0 && last_no != '0'){
       first_no = last_no = 'X';
   }
   else if(first_no % 2 != 0 && last_no %2 != 0){
       first_no = last_no = '$';
   }
    
   if(last_no == '0'){
       last_no = '#';
   }
       
    
    for(int i = 0; i < l; i++){
   char number = numbers.charAt(i);
   switch(number){
       case '1':
           number = 'B';
           break;
       case '2':
           number = 'E';
           break;
       case '3':
           number = 'A';
           break;
       case '4':
           number = '@';
           break;
       case '5':
           number = 'F';
           break;
       case '6':
           number = 'K';
           break;
       case '7':
           number = '%';
           break;
       case '8':
           number = 'R';
           break;
       case '9':
           number = 'M';
           break;
       case '0':
           number = '*';
           break;
       default:
           System.out.println("Wrong input = "+number);
   
   }
   coded_numbers = coded_numbers+number;
  
    }
   
  String new_coded_numbers = coded_numbers;

  
  if(last_no == 35)
      new_coded_numbers =  coded_numbers.substring(0,l-1) + last_no;
          else if((first_no < 48 || first_no > 57 || last_no < 48 || last_no > 57) && last_no != 35) 
    new_coded_numbers = first_no+coded_numbers.substring(1,l-1)+last_no ;
   
    System.out.println("Coded string = "+new_coded_numbers);
}
}
