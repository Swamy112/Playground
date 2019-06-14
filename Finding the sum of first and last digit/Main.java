#include <stdio.h>
int main() {
	//Type your code
  int x, y, z, sum;
  sum=0;
  scanf("%d",&x);
  sum =sum+(x%10);
  while((x/10)>0)
  {
    x=x/10;
    y=x%10;
  }
  sum =sum+y;
  printf("%d",sum) ;
	return 0;
}