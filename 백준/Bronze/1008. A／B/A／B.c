#include<stdio.h>
int a, b;
int main(void) {
    scanf("%d %d", &a, &b);
    printf("%.9f", (double)a/b);
    return 0;
}