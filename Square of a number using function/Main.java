#include<stdio.h>
   // Type your code here
  int square_of_a_num (int r)
  {
    int square =r*r;
   return square;}
  int main ()
  {
    int n, s;
    scanf("%d",&n) ;
    s= square_of_a_num(n) ;
    printf("%d",s) ;
    
   return 0;
}