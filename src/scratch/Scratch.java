package scratch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scratch {
    /**
     * Returns the log (base-10) of input.
     * Expects input to be real positive.
     * 
     * @param input MUST BE REAL
     * @return log-10 of the input
     */
    public static double getLog10 (double input) {
        return Math.log10((input));
    }
    
    public static void main(String[] args) {
        System.out.println ("Hello! I am a test program");
        double input = getDoubleFromStdin();
     
        System.out.println("The log10 of " + input + " is " + getLog10(input));
    }
        
    private static double getDoubleFromStdin () {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String rawInput = null;
    
        //  read the username from the command-line; need to use try/catch with the
        //  readLine() method
        try {
           rawInput = br.readLine();
        } catch (IOException ioe) {
           System.out.println("IO error trying to read your name!");
           System.exit(1);
        }
        
        return Double.parseDouble(rawInput);
        
    }
}
