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
public class Ship {
    int build_year;
    String name;
    Ship(){
        build_year = 0;
        name = " ";
    }
    void setYear(int build_year){
        this.build_year = build_year;
    }
    int getYear(){
        return this.build_year;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void print(){
        System.out.println("Name and year of build are= "+this.name+" "+this.build_year);
    }
    public static void main(String args[]){
        Ship obj = new Ship();
        obj.setName("Titanic");
        obj.setYear(1950);
        obj.print();
    }
}
