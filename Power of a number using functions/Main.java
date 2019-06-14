#include<stdio.h>
int main(){
    // Type your code here
  int b, e, num;
  scanf("%d%d", &b, & e) ;
  num=swa(b, e) ;
  printf("%d",num) ;
  	return 0;
  
}
int swa(int base, int exp)
{ int num1=1;
  for(int i=1;i<=exp;i++)
  num1=num1*base ;
 return num1;
} 
    