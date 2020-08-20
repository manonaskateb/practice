#include <stdlib.h>
#include <stdio.h>
#include <math.h>

double findExp(double b, double r){
    return log(r)/log(b);
}

int main() {
    setbuf(stdout, NULL); // disabling buffer so the printf happens before the scanf (so user knows when and what number to put in)

    printf("Enter the base number:");
    double base;
    scanf("%lf", &base); 

    printf("Enter the result number:");
    double result;
    scanf("%lf", &result);

    double exponent = findExp(base, result);
    if((result>1 && base>result) || (base==1 && result!=1)){
        printf("Could not find exponent: Invalid base and result numbers.");
    }else if(base==1 && result==1){
        printf("The exponent cound be anything.\n");
    }else{
        printf("%lf to the power of %lf is %lf\n", base, exponent, result);
    }

    return 0;
}