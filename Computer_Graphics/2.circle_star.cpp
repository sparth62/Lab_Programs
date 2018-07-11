#include <graphics.h>
#include<conio.h>
#include<stdio.h>
#include<time.h>
void draw_shape()
{
    int midx,midy;
    midx=getmaxx()/2;
    midy=getmaxy()/2;
    circle(midx,midy,225);
    putpixel(midx,midy,10);
    line(midx,(midy-225),(midx-170),(midy+(midy/2)+25));
    line(midx,(midy-225),(midx+170),(midy+(midy/2)+25));
    line((midx-170),(midy-(midy/2)-25),(midx+170),(midy+(midy/2)+25));
    line((midx+170),(midy-(midy/2)-25),(midx-170),(midy+(midy/2)+25));
    line((midx-170),(midy-(midy/2)-25),(midx+170),(midy-(midy/2)-25));
}
int main()
{
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "C:\\TURBOC3\\BGI");
    int upper=15,lower=1,num;
    while(1)
    {
        num = (rand() % (upper - lower + 1)) + lower;
        setcolor(num);
        draw_shape();
        Sleep(250);
        if(kbhit())
            break;
    }
    getch();
    closegraph();
    return 0;
}

