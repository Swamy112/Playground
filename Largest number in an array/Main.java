#include<stdio.h>
int main()
{
  //fill the code
  int n, large=0;
  scanf("%d", &n) ;
  int array[n] ;
  for(int i=0;i<n;i++)
    scanf("%d",&array[i]);
  for(int i=0;i<n;i++)
  {
    if(array[i]>large)
      large=array[i] ;
  }
  printf("%d", large) ;
  return 0;
}