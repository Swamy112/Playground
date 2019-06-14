#include<stdio.h>
int main()
{
	int z=0, n;
  scanf("%d", & n) ;
  int arr[n] ;
  for (int a=0;a<n;a++)
     scanf("%d", & arr[a]) ;
  for(int a=0;a<n;a++)
  {
    for(int b=a+1;b<n;b++)
    {
      if((arr[a]<arr[b])&& (arr[b] >z)) 
      { printf("%d,%d\n",arr[a],arr[b]);
        z=arr[b] ;
      }
      
    }
    z=0;
  }
      
	return 0;
}