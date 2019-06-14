#include <stdio.h>
int main() {
	//Type your code
  int x, y,z,sum;
  scanf("%d", &x) ;
  sum=0;
  while(x>0)
  {
    y=x%10;
    x=x/10;
     sum=sum+y;
  }
  printf("%d",sum) ;
	return 0;
}