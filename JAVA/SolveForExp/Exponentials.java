
import javax.swing.JOptionPane;

class Exponentials{
    public static void main(String[] args){
        String baseNumber = JOptionPane.showInputDialog("baseNumber");
        String resultNumber =  JOptionPane.showInputDialog("resultNumber");

        int base = Integer.parseInt(baseNumber);
        int result = Integer.parseInt(resultNumber);
        int output_factor;
        if(base == 1){
            JOptionPane.showMessageDialog(null, "the exponent can be anything.", "output_factor", JOptionPane.PLAIN_MESSAGE );
        } else {
            output_factor = solveForExp(base, result);
            JOptionPane.showMessageDialog(null, "the exponent is: " + output_factor , "output_factor", JOptionPane.PLAIN_MESSAGE );
        }
        return;
    }
    
    public static int solveForExp(int n, int m){
        if (m==1) {return 0;}
        else {
            return (int)(Math.log(m)/Math.log(n));
        }
    }
}