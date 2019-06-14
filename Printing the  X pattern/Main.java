#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d", &n);
  int m=n;
  for(int r=1;r<=n;r++)
  {
    for(int c=1;c<=n;c++)
    {
      if(c==r||c==m)
        printf("*");
      else
        printf(" ");
        
     }
  m--;
    printf("\n") ;} 
    
	return 0;
}