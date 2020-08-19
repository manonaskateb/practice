#include <stdlib.h>
#include <stdio.h>
#include <tgmath.h>

int main() {
    double base;
    printf("Enter the base number:\n");
    scanf("%d", &base);

    double result;
    printf("Enter the result number:\n");
    scanf("%d", &result);

    double r_log = log(result);
    double b_log = log(base);

    double exponent = 0;
    exponent = r_log/b_log;
    printf("%d to the power of %d is %d.", base, exponent, result);

    return 0;
}