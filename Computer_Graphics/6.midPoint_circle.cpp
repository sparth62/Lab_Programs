#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void sym(int x0,int y0,int x,int y)
{
    putpixel(x0 + x, y0 + y, 15);
    putpixel(x0 + y, y0 + x, 15);
    putpixel(x0 - y, y0 + x, 15);
    putpixel(x0 - x, y0 + y, 15);
    putpixel(x0 - x, y0 - y, 15);
    putpixel(x0 - y, y0 - x, 15);
    putpixel(x0 + y, y0 - x, 15);
    putpixel(x0 + x, y0 - y, 15);
}
void draw_circle(int r,int x0,int y0)
{
    int x1=0,y1=r;
    float p0=(5/4)-r;
    float pk=p0;
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "C:\\TURBOC3\\BGI");
    while(x1<=y1)
    {
        sym(x0,y0,x1,y1);
        if(pk<0)
        {
            x1=x1+1;
            pk=pk+2*x1+1;
        }
        else
        {
            x1=x1+1;
            y1=y1-1;
            pk=pk+2*x1+1-2*y1;
        }
    }
    getch();
}
int main()
{
    int r,x0,y0;
    char ch;
    printf("Enter X-coordinate of center:");
    scanf("%d",&x0);
    printf("Enter Y-coordinate of center:");
    scanf("%d",&y0);
    printf("Enter radius of center:");
    scanf("%d",&r);
    draw_circle(r,x0,y0);
    getch();
}
