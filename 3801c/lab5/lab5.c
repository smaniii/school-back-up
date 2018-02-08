#include <stdio.h>
#include <string.h>

main() {
    char hi[10000] = "THE UCF KNIGHTS ATHLETICS PROGRAMS INCLUDE THE EXTRAMURAL ANDINTRAMURAL SPORTS TEAMS OF THE UNIVERSITY OF CENTRAL FLORIDA INORLANDO, FLORIDA. THESE TEAMS ARE COLLECTIVELY REFERRED TO AS THEKNIGHTS. UCF PARTICIPATES IN THE NATIONAL COLLEGIATE ATHLETICASSOCIATION'S (NCAA) DIVISION I (FBS FOR FOOTBALL) AS A MEMBER OF THE AMERICAN ATHLETIC CONFERENCE (THE AMERICAN).";
    int i =0, j=0, k=0, x=0, y=0, z=0, a=0, b=0, c=0;
    for (i=0;i<9999;i++){
        if (hi[i] == 'K'){
            j++;
        }
        else if (hi[i] == 'N'){
            x++;
        }
        else if (hi[i] == 'I'){
            y++;
        }
        else if (hi[i] == 'G'){
            z++;
        }
        else if (hi[i] == 'H'){
            a++;
        }
        else if (hi[i] == 'T'){
            b++;
        }
        else if (hi[i] == 'S'){
            c++;
        }
    }
    printf("The number of K is %d\n",j);
    printf("The number of N is %d\n",x);
    printf("The number of I is %d\n",y);
    printf("The number of G is %d\n",z);
    printf("The number of H is %d\n",a);
    printf("The number of T is %d\n",b);
    printf("The number of S is %d\n",c);
}
