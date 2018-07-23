import java.util.Scanner;
class Office
{
	int empno;
	String empname;
	double salary;

	void getvalue()
	{
		System.out.println("Emp No:"+empno+"\nEmp name:"+empname+"\nSalary:"+salary);
	}
}

class Teaching extends Office
{
	String designition;
	Scanner s=new Scanner(System.in);
	void setvalue()
	{
		System.out.print("Enter Emp no:");
		empno=s.nextInt();
		System.out.print("Enter Emp Name:");
		empname=s.next();
		System.out.print("Enter Emp salary:");
		salary=s.nextDouble();
		System.out.print("Enter Designition(Teaching):");
		designition=s.next();
	}
	void getvalue()
	{
		super.getvalue();
		System.out.print("Designition:"+designition);
	}
}

class Non_Teaching extends Office
{
	String designition;
	Scanner s=new Scanner(System.in);
	void setvalue()
	{
		System.out.print("Enter Emp no:");
		empno=s.nextInt();
		System.out.print("Enter Emp Name:");
		empname=s.nextLine();
		System.out.print("Enter Emp salary:");
		salary=s.nextDouble();
		System.out.print("Enter Designition(Non-Teaching):");
		designition=s.next();
	}
	void getvalue()
	{
		super.getvalue();
		System.out.println("Designition:"+designition);
	}
}

class InheritanceDemo
{
	public static void main(String args[])
	{
		Teaching obj1= new Teaching();
		obj1.setvalue();
		obj1.getvalue();	
	}
	
}