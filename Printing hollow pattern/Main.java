#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d", &n) ;
  for(int r=1;r<=n;r++)
  {
    for( int c=1;c<=n;c++)
    {
      if(r==1||r==n)
        printf("*");
      else
      { if(c==1||c==n)
        printf("*");
       else
         printf(" ");
      }
    }
    printf("\n") ;
  } 
	return 0;
}