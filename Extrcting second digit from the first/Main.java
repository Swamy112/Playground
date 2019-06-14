#include <stdio.h>
int main() {
	//Type your code
  int x, y, z;
  scanf("%d", & x) ;
 while((x/100)>0)
  {
  x=x/10;
  }
  z=x%10;
  printf("%d",z);
	return 0;
}