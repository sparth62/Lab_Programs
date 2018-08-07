#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<time.h>
#include<math.h>
void drawline(int x1,int y1,int x2,int y2)
{
    int dx,dy,step,i;
    float xincr,yincr,x,y;
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "C:\\TURBOC3\\BGI");
    x=x1;
    y=y1;
    dx=(x2-x1);
    dy=(y2-y1);
    if(dx>dy)
        step=dx;
    else
        step=dy;
    xincr=dx/(float)step;
    yincr=dy/(float)step;
    for(i=0;i<step;i++)
    {
        x=x+xincr;
        y=y+yincr;
        putpixel(round(x),round(y),15);
    }
}
int main()
{
    int x1,y1,x2,y2;
    printf("Enter x-cordinate of first point:");
	scanf("%d",&x1);
	printf("Enter y-cordinate of first point:");
	scanf("%d",&y1);
	printf("Enter x-cordinate of second point:");
	scanf("%d",&x2);
	printf("Enter y-cordinate of second point:");
	scanf("%d",&y2);
	drawline(x1,y1,x2,y2);
	getch();
	return 0;
}
