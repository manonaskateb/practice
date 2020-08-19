import java.util.*;
import java.io.*;
import java.math.*;
import javax.swing.JOptionPane;

class Exponentials{
    public static void main(String[] args){
        String baseNumber = JOptionPane.showInputDialog("baseNumber");
        String resultNumber =  JOptionPane.showInputDialog("resultNumber");

        int base = Integer.parseInt(baseNumber);
        int result = Integer.parseInt(resultNumber);
        int output_factor;


        output_factor = solveForExp(base, result);

        JOptionPane.showMessageDialog(null, "the exponent is: " + output_factor , "output_factor", JOptionPane.PLAIN_MESSAGE );
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