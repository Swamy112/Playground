#include <stdio.h>
int main() {
	//Type your code
  int x, y, z;
  int fact1=1,fact2=1,fact=1;
  scanf("%d", &x) ;
   int firstdigt =x/100;
  int N=x/10;
    int seconddigt= N%10;
     int thirddigt=x%10;
 for(y=1;y<=firstdigt;y++)
   fact1=fact1*y;
  for(y=1;y<=seconddigt;y++)
    fact2=fact2*y;
  for(y=1;y<=thirddigt;y++)
    fact=fact*y;
  if((fact1+fact2+fact)==x) 
    printf("Yes");
  else
    printf("No") ;
  
	return 0;
}