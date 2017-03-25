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
public class Student{
     public static void main(String args[]){
         Scanner s = new Scanner(System.in);
         String rn;
 int marks[] = new int[5];
 int sum = 0;
 double avg;
 System.out.println("Enter student roll number");
 rn = s.nextLine();
 System.out.println("Enter marks");
 for(int i =0; i < 5;i++){
     marks[i] = s.nextInt();
 sum += marks[i];
 }
 avg = sum/5.0;
 System.out.println("Roll number is= "+rn);
         System.out.println("Average is= "+avg);
     }
}
