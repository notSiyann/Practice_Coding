/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicecode;
import java.util.Scanner;
/**
 *
 * @author anngellica
 */
public class PracticeCode {
    

    
    public static void main(String[] args){
        mainfunct("Sean");
    }
    public static void mainfunct(String name)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Data Structure, "+ name);
        
        System.out.println("Enter ID: ");
        int ID = in.nextInt();
        System.out.println("Enter Patient Name: ");
        String pname = in.next();
        System.out.println("Enter Age: ");
        int Age = in.nextInt();
        System.out.println("Enter Body Temperature: ");
        int temp = in.nextInt();
        
        System.out.println("\n\nID: " + ID + "\nPatient Name: " + pname + "\nAge: " + Age + "\nTemperature: " + temp);
        agefunct(Age);
        tempfunct(temp);
        
        
    }
    public static void agefunct(int age){
        if(age >= 1 && age <= 14){
            System.out.println("Age Status: CHILD");
        }
        else if (age >= 15 && age <= 18){
            System.out.println("Age Status: TEEN");
        }
        else if (age >= 19 && age <= 25){
            System.out.println("Age Status : YOUNG ADULT");
        }
        else if (age >= 26 && age <= 30){
            System.out.println("Age Status: ADULT");
        }
        else if (age >= 31 && age <= 69){
            System.out.println("Age Status: SENIOR");
        }
        else if (age >= 70 && age <= 1000){
            System.out.println("Age Status: IMMORTAL");
        }
    }
    public static void tempfunct(int temp){
        if (temp >= 1 && temp <= 14){
            System.out.println("Temperature Status: Rest lang sa, langga :>");
        }
        else if (temp >= 15 && temp <= 20){
            System.out.println("Temperature Status: Tulog na, dzong/dzaii");
        }
        if (temp >= 21 && temp <= 30){
            System.out.println("Temperature Status: Inom meds para everyday okay!");
        }
        else if (temp >= 31 && temp <= 40){
            System.out.println("Temperature Status: Isang ubo ka na lang, hospital na xD");
        }
        if (temp >= 41 && temp <= 50){
            System.out.println("Temperature Status: Condolence po.");
        }
        else if (temp >= 0){
            System.out.println("Temperature Status: IMMUNE");
        }
    }
    
}
