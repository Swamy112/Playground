#include <stdio.h>
int main() {
	// Type your code here
  int n, v, a;
  scanf("%d", &n) ;
  for(int r=1;r<=n;r++)
  {
    for(int c=1;c<=n;c++)
    {
      if(r%2==1)
      {
        if(c!=n) 
        printf("%d",r);
       else
       {  v =r+1;
       printf("%d",v);} 
      }
      else
      {
        if(c==1)
        { a =v+1;
          printf("%d",a);} 
        else
        printf("%d",v) ;
      }
    }
    printf("\n") ;
  } 
        
       
	return 0;
}