#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d", & n) ;
  for(int x=1;x<=n;x++)
  {
    for(int y=1;y<=(n-x);y++)
      printf(" ") ;
    for(int z=1;z<=2*x-1;z++)
      printf("*");
    printf("\n");
  }
	return 0;
}