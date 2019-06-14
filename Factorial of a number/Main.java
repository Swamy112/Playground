#include <stdio.h>
int main() {
	//Type your code
  int x, n,fact;
  fact=1;
scanf("%d", &n) ;
for(x=1;x<=n;x++)
{
  fact=fact*x;
}
  printf("%d",fact);
  
	return 0;
}