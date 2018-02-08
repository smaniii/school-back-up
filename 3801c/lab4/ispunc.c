#include <stdio.h>
#include <string.h>

main() {

    char hi[50] = "ThiS is A !@# Weird StrinG.";
    int i;
    int x=0;
    for (i=0;i<40;i++) {
        if (ispunct(hi[i]) != 0) {
            x++;
        }
    }
    printf("the number of punc is %d",x);
}
