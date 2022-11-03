/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicecode2;
import java.util.Scanner;
/**
 *
 * @author anngellica
 */
public class PracticeCode2 {
    public static int PublicID;
    public static String PublicName;
    public static String PublicSub;
    public static double PublicGrade;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter ID: ");
        PublicID = in.nextInt();
        System.out.println("Enter your Name: ");
        PublicName = in.next();
        System.out.println("Enter Subject: ");
        PublicSub = in.next();
        System.out.println("Enter Grade: ");
        PublicGrade = in.nextDouble();
        
        System.out.println("\nID: " + PublicID + "\nName: " + PublicName + "\nSubject: " + PublicSub + "\nGrade: " + PublicGrade);
        mainfunct();
        gradefunct();
        // TODO code application logic here
    }
    public static void mainfunct() {
        System.out.println("PublicName");
    }
    public static void gradefunct() {
        if (PublicGrade >= 0 && PublicGrade <=49){
            System.out.println("FAIL!!!");
        }
        else if (PublicGrade >= 50 && PublicGrade <= 74){
            System.out.println("VERY POOR");
        }
        else if (PublicGrade >= 75 && PublicGrade <= 79){
            System.out.println("POOR");
        }
        else if (PublicGrade >= 80 && PublicGrade <= 84){
            System.out.println("GOOD!");
        }
        else if (PublicGrade >= 85 && PublicGrade <= 89){
            System.out.println("VERY GOOD!!");
        }
        else if (PublicGrade >= 90 && PublicGrade <= 100){
            System.out.println("EXCELLENT!!!");
        }
    }
}
