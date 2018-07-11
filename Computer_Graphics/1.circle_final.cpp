#include <graphics.h>
#include<conio.h>
#include<stdio.h>
#include<time.h>
int main()
{
    int gd = DETECT, gm;
    int i;
    initgraph(&gd, &gm, "C:\\TURBOC3\\BGI");
    setcolor(10);
    circle(getmaxx()/2,getmaxy()/2,200);
    Sleep(500);
    setcolor(1);
    circle(getmaxx()/2,getmaxy()/2,175);
    Sleep(500);
    setcolor(2);
    circle(getmaxx()/2,getmaxy()/2,150);
    Sleep(500);
    setcolor(3);
    circle(getmaxx()/2,getmaxy()/2,125);
    Sleep(500);
    setcolor(4);
    circle(getmaxx()/2,getmaxy()/2,100);
    Sleep(500);
    setcolor(5);
    circle(getmaxx()/2,getmaxy()/2,75);
    Sleep(500);
    setcolor(6);
    circle(getmaxx()/2,getmaxy()/2,50);
    Sleep(500);
    setcolor(7);
    circle(getmaxx()/2,getmaxy()/2,25);
    Sleep(500);
    putpixel(getmaxx()/2,getmaxy()/2,10);
    rectangle(15,30,15,30);
    printf("%d ",getpixel(getmaxx()/2,getmaxy()/2));
    printf("\n%d , %d", getmaxx(),getmaxy());
    getch();
    closegraph();

    return 0;
}
