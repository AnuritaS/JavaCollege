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
public class Employee{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
String Level;
int Job_number;
double Gross, Basic, House_rent, Perks, Net, Incometax;
double CA1=1000,CA2=750,CA3=500,CA4=250,EA1=500,EA2=200,EA3=100,EA4=0;
System.out.println("Enter details");
Level = s.nextLine();
Job_number = s.nextInt();
Basic = s.nextDouble();
House_rent = 0.25*Basic;
switch (Level){
case "Manager":
Perks = CA1+EA1;
break;
case "Project Leader":
Perks = CA2+EA2;
break;
case "Software Engineer":
Perks = CA3+EA3;
break;
case "Consultant":
Perks = CA4+EA4;
break;
default:
Perks = 0.0;
}

Gross = Basic+House_rent+Perks;
if(Gross <= 2000)
Incometax = 0.0;
else if(Gross > 2000 && Gross <= 4000)
Incometax = 0.03*Gross;
else if(Gross > 4000 && Gross <= 5000)
Incometax = 0.05*Gross;
else 
Incometax = 0.08*Gross;

Net = Gross-Incometax;
System.out.println("Level is= "+Level+" Job number is= "+Job_number+" Gross pay is= "+Gross+" Income tax is= "+Incometax+" Net salary is= "+Net);

}
}