#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<time.h>
#include<math.h>
void drawline(int x0,int y0,int x1,int y1)
{
    int dx,dy,i;
    int p0,pk;
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "C:\\TURBOC3\\BGI");
    dx=x1-x0;
    dy=y1-y0;
    p0=2*dy-2*dx;
    pk=p0;
    for(i=0;i<dx;i++)
    {
        putpixel(x0,y0,15);
        if(pk<0)
        {
            x0=x0+1;
            pk=pk+2*dy;
        }
        else
        {
            x0=x0+1;
            y0=y0+1;
            pk=pk+2*dy-2*dx;
        }
    }
}
int main()
{
    int x0,y0,x1,y1;
    printf("Enter x-cordinate of first point:");
	scanf("%d",&x0);
	printf("Enter y-cordinate of first point:");
	scanf("%d",&y0);
	printf("Enter x-cordinate of second point:");
	scanf("%d",&x1);
	printf("Enter y-cordinate of second point:");
	scanf("%d",&y1);
	drawline(x0,y0,x1,y1);
	getch();
	return 0;
}
