#include<stdio.h>
#include<conio.h>
#include<ctype.h>
#include<stdlib.h>
#include<string.h>

FILE *fp;
int fop=0,numflag=0,f=0;
char c,ch,sop;
int ischecked;

char special_ch[15][15]={",",";","#","[","]","{","}","(",")","#","\t","\n"};
char operator[15][15]={"+","-","*","/","%","=","<",">"};
char keyword[30][20]={"int","float","char","double","bool","void","extern","unsigned","goto","static","class","struct","for","if","else","return","register","long","while","do","include","define","main"};
char header[15][15]={"stdio.h","conio.h","malloc.h","process.h","string.h","ctype.h"};
void isoperator(char word[])
{
	int i;
	for(i=0;i<50;i++)
	{
		if(strcmp(operator[i],word)==0)
		{
			printf(":operator");
			ischecked=1;
		}
	}
	
	return;
}

void isspecial_ch(char word[])
{
	int i;
	for(i=0;i<50;i++)
	{
		if(strcmp(special_ch[i],word)==0)
		{
			printf(":special_ch");
			ischecked=1;
		}
	}
	
	return;
}

void isKeyword(char word[])
{
	int i;
	for(i=0;i<50;i++)
	{
		if(strcmp(keyword[i],word)==0)
		{
			printf(":keyword");
			ischecked=1;
		}
	}
	
	return;
}

void isheader(char word[])
{
	int i;
	for(i=0;i<50;i++)
	{
		if(strcmp(header[i],word)==0)
		{
			printf(":header");
			ischecked=1;
		}
	}
	
	return;
}

void isidentifier()
{
	if(ischecked==0)
	{
		printf(" :identifier");
		ischecked=0;
	}
}

void analyser_parth()
{
	char take_word[50];
	int i=0;
	while(!feof(fp))
	{

		c=fgetc(fp);
		if(c==10)
		{
			c=32;
		}
		if(c==-1)
			c=32;
		if(c!=32)
		{
			take_word[i++]=c;
		}		
		else
		{
			take_word[i]='\0';
			printf("\n%s ",take_word);
			ischecked=0;
			isKeyword(take_word);
			isoperator(take_word);
			isheader(take_word);
			isspecial_ch(take_word);
			isidentifier(take_word);

			memset(take_word,0,strlen(take_word));
			i=0;
		}
		
	}

}

	
int main()
{
	char fname[20];
	system("cls");
	printf("Enter file name (file name must be without space):");
	scanf("%s",fname);
	fp=fopen(fname,"r");

	analyser_parth();

	printf("\nAnalysis is completed");
	getch();
}

	