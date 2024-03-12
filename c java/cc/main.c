#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a []={1,2,3,4,5};

    for(int j=4;j>0;j--){
        a[j]+=a[j-1];
    }

    printf(a);

}
