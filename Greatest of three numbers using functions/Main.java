#include <stdio.h>
int main(){
	// Type your code here
  int x, y, z, g;
  scanf("%d%d%d", &x, &y, &z) ;
     if(x>y)
         g=x;
        else
        g=y;
        if(g>z)
        printf("%d",g) ;
        else
        printf("%d", z) ;
  	return 0;
}