#include <stdio.h>
#include <string.h>

main() {

    char hi[50] = "This is a test. 1 2 3 4 5 !!";
    int i;
    int x=0;
    for(i = 0; i<40; i++){
        hi[i] = tolower(hi[i]);
        }
    printf("%s",hi);
}

