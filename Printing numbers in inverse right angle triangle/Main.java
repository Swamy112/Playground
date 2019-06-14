#include <stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d", &n);
  for(int x=1;x<=n;x++){
    int y=n-(x-1);
  for(int z=1;z<=n-(x-1);z++){
    printf("%d",y);
    y--;} 
  
    printf("\n") ;} 
	return 0;
}