/*Write a C code to find the sum of 'n' natural numbers using recursion.
﻿Sample Input:

9



Sample Output:

45*/#include <stdio.h>
#include <stdlib.h>
int addNumbers(int n);
int main()
{
    int num;
  	scanf("%d", &num);
    printf("%d",addNumbers(num));
    return 0;
}

int addNumbers(int n)
{
    if(n != 0)
        return n + addNumbers(n-1);
    else
        return n;
}