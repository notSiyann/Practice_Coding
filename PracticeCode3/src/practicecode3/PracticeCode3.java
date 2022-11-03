/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicecode3;
import java.util.Scanner;
/**
 *
 * @author anngellica
 */
public class PracticeCode3 {
public static String charName,charGender,charType,charStr,charAgi,charInt;
public static boolean status = true;
public static Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mainfunction();
    }
    public static void mainfunction(){
        while(status){
            System.out.println("\n_____________________________\n ");
            System.out.println("Enter Character Name: ");
            charName = in.next();
            
            while(status){
                System.out.println("Enter Character Gender: \nMale Female");
                charGender = in.next();
                if(!charGender.equals("Male") && !charGender.equals("Female")){
                    System.out.println("Invalid Gender \n");
                    status = true;
                }
                else{
                    charTypeFunction();
                    status = false;
                }
            }
        }
        System.out.println("\n_____________________________\n ");
        System.out.println("Welcome to Otherworld " + "\nName: " + charName 
                + "\nGender: " + charGender 
                + "\nType: " + charType 
                + "\nStrength: " + charStr 
                + "\nAgility: " + charAgi 
                + "\nIntelligence: " + charInt);
    }
    public static void charTypeFunction(){
        while(status){
            System.out.println("Enter Character Type: \nWarrior Assassin Archer Wizard Healer");
            charType = in.next();
            
            switch (charType) 
            {
                case "Warrior":
                    charStr = "120";
                    charAgi = "80";
                    charInt = "45";
                    status = false;
                    break;
                case "Assassin":
                    charStr = "105";
                    charAgi = "116";
                    charInt = "95";
                    status = false;
                    break;
                case "Archer":
                    charStr = "45";
                    charAgi = "110";
                    charInt = "80";
                    status = false;
                    break;
                case "Wizard":
                    charStr = "35";
                    charAgi = "65";
                    charInt = "130";
                    status = false;
                    break;
                case "Healer":
                    charStr = "20";
                    charAgi = "65";
                    charInt = "110";
                    status = false;
                    break;
                default:
                    System.out.println("Invalid Character type: \n");
                    status = true;
                    break;
            }
        }
    }
}