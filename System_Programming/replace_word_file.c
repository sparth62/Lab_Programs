//C program to find and replace a word in a file
#include<stdio.h>
#include<string.h>
#define MAX 256

int main()
{
	char *ptr1;
	FILE *fp1,*fp2;
	char word[MAX],replace[MAX],take_word[MAX];
	printf("Enter your string:");
	scanf("%s",word);
	printf("Enter your replace string:");
	scanf("%s",replace);
	fp1=fopen("1st.txt","r");
	fp2=fopen("2nd.txt","w");
	int i=0,newline=0;
	char c;
	while(!feof(fp1))
	{
		c=fgetc(fp1);
		if(c==10)
		{
			c=32;
			newline=1;
		}
		if(c==-1)
			c=32;
		
		if( c!=32)
		{
			take_word[i++]=c;
			ptr1++;
		}		
		else
		{
			take_word[i]='\0';
			if( strcmp(take_word,word)==0)
			{
				ptr1=ptr1+strlen(word);
				fprintf(fp2,"%s ",replace);
			}
			else
			{
				fprintf(fp2,"%s ",take_word);
			}
			memset(take_word,0,strlen(take_word));
			i=0;
			if(newline==1)
			{
				fprintf(fp2,"\n");
				newline=0;
			}
		}
		
	}
	fclose(fp1);
	fclose(fp2);
	
	system("del 1st.txt");
	system("ren 2nd.txt 1st.txt");
}