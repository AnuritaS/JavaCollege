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
public class Sort {
    void sorting(){
        Scanner s = new Scanner(System.in);
        String[] names = new String[5];
        String temp = "";
        System.out.println("Enter 5 names");
        for(int i = 0; i < 5; i++){
            names[i] = s.nextLine();
        }
        for(int x = 0; x < 4; x++){
            for(int y = x+1; y < 5; y++){
                int value = names[y].compareTo(names[x]);
                if(value < 0){
                  temp = names[y];
                 names[y] = names[x];
                 names[x] = temp;
                }
            }
            
        }
         System.out.println("Sorted names");
        for(int i = 0; i < 5; i++){
            System.out.print(names[i]+ " ");
        }
    }
    public static void main(String args[]){
        Sort obj = new Sort();
        obj.sorting();
    }
}