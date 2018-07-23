#include<conio.h>
#include<graphics.h>
#include<stdio.h>
#include<time.h>
#include<math.h>
void translation(double x1,double y1,double x2,double y2)
{
	double tx,ty;
	int gd = DETECT, gm;
	printf("Enter tx:");
	scanf("%lf",&tx);
	printf("Enter ty:");
	scanf("%lf",&ty);
	printf("Your line will shown on window in white color....");
	printf("\nYour new line will shown on window in green color....");
	Sleep(5000);
	initgraph(&gd, &gm, "C:\\TURBOC3\\BGI");
	line(x1,y1,x2,y2);
	setcolor(10);
	line(x1+tx,y1+ty,x2+tx,y2+ty);
	getch();
}
void scaling(double x1,double y1,double x2,double y2)
{
    double sx,sy;
	int gd = DETECT, gm;
	printf("Enter sx:");
	scanf("%lf",&sx);
	printf("Enter sy:");
	scanf("%lf",&sy);
	printf("Your line will shown on window in white color....");
	printf("\nYour new line will shown on window in green color....");
	Sleep(5000);
	initgraph(&gd, &gm, "C:\\TURBOC3\\BGI");
	line(x1,y1,x2,y2);
	setcolor(10);
	line(x1*sx,y1*sy,x2*sx,y2*sy);
	getch();
}

void rotation(double x1,double y1,double x2,double y2)
{
    double angle;
	int gd = DETECT, gm;
	printf("Enter rotation angle:");
	scanf("%lf",&angle);
	printf("Your line will shown on window in white color....");
	printf("\nYour new line will shown on window in green color....");
	Sleep(5000);
	initgraph(&gd, &gm, "C:\\TURBOC3\\BGI");
	line(x1,y1,x2,y2);
	setcolor(10);
	//x1=x1*cos(angle)-y1*sin(angle);
	//y1=x1*sin(angle)+y1*cos(angle);
	x2=x2*cos(angle)-y2*sin(angle);
	y2=x2*sin(angle)+y2*cos(angle);
	line(x1,y1,x2,y2);
	getch();
}
int main()
{
	double x1,x2,y1,y2;
	int ch;
	printf("Enter x-cordinate of first point:");
	scanf("%lf",&x1);
	printf("Enter y-cordinate of first point:");
	scanf("%lf",&y1);
	printf("Enter x-cordinate of second point:");
	scanf("%lf",&x2);
	printf("Enter y-cordinate of second point:");
	scanf("%lf",&y2);

	printf("MENU");
	printf("\n--------------\n");
	printf("1.Translation\n2.Rotation\n3.Scaling");
	printf("\n--------------\n");
	printf("Enter your choice:");
	scanf("%d",&ch);
	switch(ch)
	{
		case 1: translation(x1,y1,x2,y2);
                break;
        case 2: rotation(x1,y1,x2,y2);
                break;
        case 3: scaling(x1,y1,x2,y2);
                break;
	}

}
