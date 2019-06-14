#include <stdio.h>
int main() {
	//Type your code
  int x, y,z;
  scanf("%d", &x) ;
  for(y=1;y<=x;y++)
  {
     printf("%d",y) ;
      if (y%3==0)
       printf(",") ;
  } 
	return 0;
}