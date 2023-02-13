import java.io.*;
import java.util.*;

public class JavaIntToString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        String s = Integer.toString(n);
        if(n == Integer.parseInt(s)){
            System.out.println("Good Job");
        }
        else{
            System.out.println("wrong answer");
        }
    }
}
