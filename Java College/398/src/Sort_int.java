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

public class Sort_int {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int[] number = new int[5];
        int temp = 0;
        System.out.println("Enter 5 numbers");
        for(int i = 0; i < 5; i++){
            number[i] = s.nextInt();
        }
        for(int x = 0; x < 4; x++){
            for(int y = x+1; y < 5; y++){
                if(number[y] < number[x]){
                 temp = number[y];
                 number[y] = number[x];
                 number[x] = temp;
                }
            }
            
        }
         System.out.println("Sorted numbers");
        for(int i = 0; i < 5; i++){
            System.out.print(number[i]+ " ");
        }
    }
}