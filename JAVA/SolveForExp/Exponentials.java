import java.math.*;
import javax.swing.JOptionPane;

class Exponentials{
    public static void main(String[] args){
        String baseNumber = JOptionPane.showInputDialog("baseNumber");
        String resultNumber =  JOptionPane.showInputDialog("resultNumber");

        double base = Integer.parseInt(baseNumber);
        double result = Integer.parseInt(resultNumber);
        double output_factor;
        if((result>1 && base>result) || (base==1 && result!=1)){
            JOptionPane.showMessageDialog(null, "Could not find exponent: Invalid base and result numbers.", "output_factor", JOptionPane.PLAIN_MESSAGE );
        }else if(base==1 && result==1){
            JOptionPane.showMessageDialog(null, "the exponent can be anything.", "output_factor", JOptionPane.PLAIN_MESSAGE );
        } else {
            output_factor = solveForExp(base, result);
            JOptionPane.showMessageDialog(null, "the exponent is: " + output_factor , "output_factor", JOptionPane.PLAIN_MESSAGE );
        }
        return;
    }
    
    public static double solveForExp(double b, double r){
        return Math.log(r)/Math.log(b);
    }
}