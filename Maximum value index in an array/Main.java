// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n,max, g=0;
  scanf("%d", &n) ;
  int array[n] ;
  for(int i=0;i<n;i++)
    scanf("%d",&array[i]);
  for(int i=0;i<n;i++)
  {
    if(array[i]>g)
    {
      g=array[i] ;
      max=i;
    }
  }
  printf("%d",max) ;
  
  
   return 0;
}