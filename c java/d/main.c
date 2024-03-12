#include <stdio.h>
#include <stdlib.h>

int main()
{
    int p=6;
    int q=8;
    int r=8;
    q=(q+3)&q;
    printf( p+q+r);
    return 0;
}
