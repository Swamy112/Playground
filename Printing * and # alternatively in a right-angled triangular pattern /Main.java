#include <stdio.h>
int main(){
	// Type your code here
  int n;
  int num=0;
  scanf("%d", &n) ;
  for(int row=1;row<=n;row++)
  {
    for(int clm=1;clm<=row;clm++)
    {
      num=num+1;
      if ((num%2)==0)
        printf("#");
      else
        printf("*");
    }
    printf("\n");
  }
  	return 0;
}