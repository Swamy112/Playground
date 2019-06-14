#include <stdio.h>
int main() {
	//Type your code
  int i,n,z;
 z=0;
  scanf("%d",&n) ;
   for(i=1;z<n;i++)
   { if((i%2) ==1)
        { printf("%d\n",i);
          z=z+1;} 
   } 
	return 0;
}