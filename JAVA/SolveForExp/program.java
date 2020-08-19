import java.util.*;
import java.io.*;

public static void main(String[] args) throws Exception {
    int input_int = 2;
    int input_mult = 8;
    int output_factor;

    output_factor = solveForExp(input_int, input_mult);

    System.out.print(input_int + " to the power of " + output_factor + " is equal to" + input_mult + ".\n");
    return;
}