/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anurita
 */  import java.util.Scanner;
public class Transpose {
     public static Scanner s = new Scanner(System.in);
    static int[][] arr1 = new int[2][3];
    static int[][] arr2 = new int[3][2];
     static int m_arr[][] = new int[2][2];
    static int t_arr[][] = new int[3][2];
    public static void main(String args[]){
        int ch;
    System.out.println("1. Enter elements 2. Multiply 3. Transpose 4. Display 5. exit");
    
while( true ){
        System.out.println("Enter choice");
        ch = s.nextInt();
    switch(ch){
        case 1:
           Accept();
            break;
        case 2:
            Multiply();
            break;
            case 3:
            Transpose();
            break;
            case 4:
       Display();
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
       
            System.out.println("Enter in array1 ");
        for(int i = 0; i < 2; i++){
              for(int j = 0; j < 3; j++){
            arr1[i][j] = s.nextInt();
        }
        }
                          System.out.println("Enter in array2 ");
        for(int i = 0; i < 3; i++){
              for(int j = 0; j < 2; j++){
            arr2[i][j] = s.nextInt();
        }
        }
}
    static void Multiply(){
      
            
        for(int i = 0; i < 2; i++){
              for(int j = 0; j < 2; j++){
                  for(int k = 0; k < 2; k++){
            m_arr[i][j] = m_arr[i][j]+arr1[i][k]*arr2[k][j];
            }
        }
    }
    }
    
    static void Transpose(){
       
            
        for(int i = 0; i < 3; i++){
              for(int j = 0; j < 2; j++){
            t_arr[i][j] = arr1[j][i];
        }
    }
    }
        
    static void Display(){
         System.out.println("Multiplied array ");
     for(int i = 0; i < 2; i++){
              for(int j = 0; j < 2; j++){
            System.out.print(m_arr[i][j]+" ");
              }
               System.out.println();
     }
    System.out.println("New transpose array ");
     for(int i = 0; i < 3; i++){
              for(int j = 0; j < 2; j++){
            System.out.print(t_arr[i][j]+" ");
              }
               System.out.println();

    }
}
    }

