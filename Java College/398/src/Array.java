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
public class Array {
     public static Scanner s = new Scanner(System.in);
    static int[] arr = new int[10];
    public static void main(String args[]){
        int ch;
    System.out.println("1. Accept elements of an array 2. Display elements of an array 3. Search the element within array given by user 4. Sort the array using bubble sort method 5. exit");
    
while( true ){
        System.out.println("Enter choice");
        ch = s.nextInt();
    switch(ch){
        case 1:
            Accept();
            break;
        case 2:
            Display();
            break;
        case 3:
            Search();
            break;
        case 4:
            Sort();
            break;
        case 5:
            System.exit(0);
            break;
        default:
            System.out.println("Invalid choice");
    }
    }
    
   }
    static void Accept(){
       
            System.out.println("Enter 10 variables");
        for(int i = 0; i < 10; i++){
            arr[i] = s.nextInt();
        }
}
    static void Display(){
        System.out.println("Array elements are");
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    static void Search(){
        System.out.println("Enter search element");
        int search_no = s.nextInt();
        for(int i = 0; i < 10; i++){
            if(arr[i] == search_no){
                System.out.println("Element found at "+i);
                return;
            }
        }
    }
    
    static void Sort(){
        int temp = 0;
        for(int i=0; i<9; i++){
            for(int j=i+1; j<10; j++){
                if(arr[j]<arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
 
    }

