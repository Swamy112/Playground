#include<stdio.h>
int main()
{
  //Type your code here
 long int n,s1,s2, s3=0,s4=0;
  scanf("%ld", &n) ;
  int  array[n] ;
  for(int i=0;i<n;i++)
    scanf("%d",&array[i]);
  scanf("%ld%ld", &s1, & s2) ;
  for(int i=0;i<n;i++)
  {
     if(s1==array[i])
     s3=i+1;
     if(s2==array[i])
      s4=i+1;

  }
  if(s3>=1)
    printf("%ld\n",s3-1);
  else
    printf("-1\n");
  if(s4>=1)
    printf("%ld\n",s4-1);
  else
    printf("-1");
      
  
  return 0;
}