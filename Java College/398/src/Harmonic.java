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
public class Harmonic
{
public static void main(String args[])
{
    Scanner s = new Scanner(System.in);
int n,i;
float sum=0;
System.out.println("Enter nth number");
n=s.nextInt();

for(i=1;i<=n;i++)
{
sum=sum+(float)1/i;
}

System.out.println("Sum="+sum);
}
}