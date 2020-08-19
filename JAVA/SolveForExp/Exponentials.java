import java.util.*;
import java.io.*;
import java.math.*;

class Exponentials{
    public static void main(String[] args){
        int input_int = Integer.parseInt(args[0]);
        int input_mult =  Integer.parseInt(args[1]);
        int output_factor;

        output_factor = solveForExp(input_int, input_mult);

        System.out.print(input_int + " to the power of " + output_factor + " is equal to " + input_mult + ".\n");
        return;
    }
    
    public static int solveForExp(int n, int m){
        int factor;
        if (m==1) {return 0;}
        else {
            return (int)(Math.log(m)/Math.log(n));
        }
    }
}