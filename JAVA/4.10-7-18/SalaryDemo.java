 /*Write a java program to calculate gross salary & net salary taking the following data.
Input:empno,empname,basic
 Process:
 DA=50%of basic, HRA=25%of basic, CCA=Rs240/-, PF=10%of basic, PT=Rs100/-*/
 import java.util.Scanner;
 class Salary
 {
 	int empno;
 	String empname;
 	double basic;
 	double net,gross;
 	Salary()
 	{
 		double hra,da,pf,pt,cca;
 		Scanner s=new Scanner(System.in);
 		System.out.print("Enter empno:");
 		empno=s.nextInt();
 		System.out.print("Enter name:");
 		empname=s.next();
 		System.out.print("Enter basic pay:");
 		basic=s.nextDouble();
 		hra=0.25*basic;
 		da=0.5*basic;
 		cca=240;
 		pf=0.1*basic;
 		pt=100;
 		net=basic+da+hra;
 		gross=net+pf+pt+cca;
 	}
 	double get_gross_salary()
 	{
 		return gross;
 	}
 	double get_net_salary()
 	{
 		return net;
 	}
 }

 class SalaryDemo
 {
 	public static void main(String args[])
 	{
 		Salary e1=new Salary();
 		System.out.println("Net salary ="+e1.get_net_salary()+"\nGross salary ="+e1.get_gross_salary());
 	}

 }