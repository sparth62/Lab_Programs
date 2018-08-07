#include<stdio.h>
#include<stdlib.h>
int main(int argc,char *argv[])
{
	FILE *f1, *f2;
	char ch;
	f1=fopen(argv[1],"r");
	if(f1==NULL)
	{
		printf("%s can not open...",argv[1]);
		exit(0);
	}
	f2=fopen(argv[2],"w");

	while(1)
	{
		ch=fgetc(f1);
		if(feof(f1)) break;
		fputc(ch,f2);
	}
	fclose(f1);
	fclose(f2);
	return 0;
}
