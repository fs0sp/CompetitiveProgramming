#include <assert.h>
#include <ctype.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>



int main()
{
    // Beware of Valak
    
    int i,t,n,d,r;
    
    
    
    
    scanf("%d",&t);  // test case
    
    for(i=0;i<t;i++) {
    scanf("%d",&n);
    scanf("%d",&d);
    scanf("%d",&r);
    
    int sum  = 0;
    int ex = d*r;
    
    if(n == 1) {
        sum = d;
    }
    
    else if(n == 2) {
        sum = d + d*r;
    }
    
    else if(n == 3) {
        sum = d + d*r + d*r*r;
    }
    
    else if(n == 4) {
        sum = d + d*r + d*r*r + d*r*r*r;
    }
    
    else if(n == 5) {
        sum = d + d*r + d*r*r + d*r*r*r + d*r*r*r*r;
    }
    
    else if(n == 6) {
        sum = d + d*r + d*r*r + d*r*r*r + d*r*r*r*r + d*r*r*r*r*r;
    }
    
    else if(n == 7) {
        sum = d + d*r + d*r*r + d*r*r*r + d*r*r*r*r + d*r*r*r*r*r + d*r*r*r*r*r*r;
    }
    
    else if(n == 8) {
        sum = d + d*r + d*r*r + d*r*r*r + d*r*r*r*r + d*r*r*r*r*r + d*r*r*r*r*r*r  + d*r*r*r*r*r*r*r;
    }
    
    printf("%d\n",sum);
        
    }
    

    return 0;
}
