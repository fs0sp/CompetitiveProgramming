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
    // Think twice, code once
    
    int i;
    int a,p,c,b,t;
    
    scanf("%d",&t);
    
    for(i=0;i<t;i++) {
    
        scanf("%d",&a);
        scanf("%d",&c);
        
    b = a^c;
    
        printf("%d\n",b);
        
        
        
    }

    return 0;
}
