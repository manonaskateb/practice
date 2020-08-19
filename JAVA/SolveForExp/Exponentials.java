import java.util.*;
import java.io.*;
import java.math.log;

class Exponentials{
    public static void main(String[] args) throws Exception {
        int input_int = 2;
        int input_mult = 8;
        int output_factor;

        output_factor = solveForExp(input_int, input_mult);

        System.out.print(input_int + " to the power of " + output_factor + " is equal to" + input_mult + ".\n");
        return;
    }
    
    public static int solveForExp(int n, int m){
        int factor;
        if (m==1) {factor = 0;}
        else {
            factor = (int)(Math.log(n)/Math.log(m));
        }
        return factor;
    }
}