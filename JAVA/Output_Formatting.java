// Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.
// To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.
// Sample Input
// java 100
// cpp 65
// python 50
// Sample Output
// ================================
// java           100 
// cpp            065 
// python         050 
// ================================

package JAVA;

import java.util.Scanner;

public class Output_Formatting {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            
    
            System.out.format("%-15s%03d%n", s1, x);
            //Complete this line
        }
        System.out.println("================================");

  }
}
