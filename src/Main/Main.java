/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Scanner;

/**
 *
 * @author k_zeb
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word.");
        String word = in.nextLine();
        String firstLine = "";
        for (int i = 0; i < word.length(); i++) {
            firstLine = firstLine + word.charAt(i) + " ";
        }
        System.out.println("* " + firstLine + "*");
        for (int a = 0; a < word.length(); a++) {
            String middleLine = "";
            for (int b = 0; b < word.length(); b++) {
                middleLine = middleLine + "* ";
            }
            System.out.println(word.charAt(word.length()-1-a) + " " + middleLine + word.charAt(a));
        }
        String lastLine = "";
        for (int i = word.length()-1; i >= 0; i--) {
            lastLine = lastLine + word.charAt(i) + " ";
        }
        System.out.println("* " + lastLine + "*");
    }
    
}
