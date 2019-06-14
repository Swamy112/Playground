#include <stdio.h>
int main() {
	//Type your code here
  int x, y, z, s, st,gcd;
  gcd=1;
  scanf("%d%d%d", & x, & y, & z) ;
  if(x<y)
    s=x;
  else
    s=y;
  if(s<z)
    st=s;
  else
    st=z;
  for(int i=1;i<=st;i++)
  {
    if((x%i==0) && (y%i==0)&&(z%i==0))
      gcd=i;
  }
  printf("%d", gcd) ;
    
      
	return 0;
}