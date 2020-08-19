#include <stdlib.h>
#include <stdio.h>
#include <math.h>

double findExp(int b, int r){
    return log(r)/log(b);
}

int main() {
    setbuf(stdout, NULL); // disabling buffer so the printf happens before the scanf (so user knows when and what number to put in)

    printf("Enter the base number:");
    double base;
    scanf("%d", &base); 

    printf("Enter the result number:");
    double result;
    scanf("%d", &result);

    double exponent = findExp(base, result);
    printf("%d to the power of %d is %d.\n", base, exponent, result);

    return 0;
}