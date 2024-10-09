#include<stdio.h>

int a, b;

int main(void) {
    scanf("%d %d", &a, &b);
    printf("%d\n", a*(b%10));
    printf("%d\n", a*((b%100)-(b%10))/10);
    printf("%d\n", a*(b-(b%100))/100);
    printf("%d", a*b);
    
    return 0;
}