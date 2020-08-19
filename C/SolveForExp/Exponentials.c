#include <stdlib.h>
#include <stdio.h>
#include <math.h>

class Exponentials{

    
    int base;
    printf("Enter the base number:");
    scanf("%d", &base);

    int result;
    printf("Enter the result number:");
    scanf("%d", &result);

    int exponent = (int)(log(result)/log(base));
    printf(base + " to the power of " + exponent + " is " + result + ".");

    return 0;
}