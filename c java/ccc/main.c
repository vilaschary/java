#include <stdio.h>
#include <stdlib.h>

int main()
{
    enum month
    {
        jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec;
    }
        enum month next_month(enum month m)
        {

            return((m+1)%12);
        }

    print("%d",next_month(dec));
}

