#include<stdio.h>
#include<malloc.h>
#include<stdlib.h>
#include<error.h>

typedef int *Dict;

Dict ConsDict(int size) {
    int *p=(int*)malloc((size+2)*sizeof(int));
    p[0] = 0; p[1] = size;
    return p;
}

void swap (int *xp , int *yp) {
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}
int func (int x){
    return x*x;
}
void BubbleSort (int *d , int size ) {
    int i , j ;
    int swapped = 0;
    for (i = 0 ; i < size -1 ; i++){
        swapped = 0;
        for (j = 0 ; j < size-i-1 ; j++){
            if (func(*(d+j)) > func(*(d+j+1))){
                swap(d+j , d+j+1);
                swapped = 1;
            }
        }
        if (swapped == 0){
            break;
        }
    }
}

void SortDict(Dict d) {
    BubbleSort(d+2,d[0]);
}
void InsertDict(Dict d, int i) {
    if(d[0]==d[1]) error(-1,0,"Dictionally full!");
    d[d[0]+2]=i;
    d[0]+=1;
}


void DisplayDict(Dict d) {
int i;
printf("Displaying dictionary with %d elements, size %d: ",d[0],d[1]);
for(i=2; i<d[0]+2; i++) {
printf("Element%02d=%d ",i-1,d[i]);
}
printf("\n");
}