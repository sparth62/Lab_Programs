//class student define variables Enrollment No., Name, Sem. Print all info for 3 student

class Student
{
	String enroll_no;
	String name;
	int sem;
}

class StudentDemo
{
	public static void main(String args[])
	{
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.enroll_no="160470116050";
		s1.name="Parth";
		s1.sem=5;

		s2.enroll_no="160470116051";
		s2.name="Shinojiya";
		s2.sem=6;

		s3.enroll_no="160470116052";
		s3.name="Parth Shinojiya";
		s3.sem=7;

		System.out.println("Enrollment_Number: "+s1.enroll_no);
		System.out.println("Name: "+s1.name);
		System.out.println("Semester: "+s1.sem);
		System.out.println("-----------------------------");
		
		System.out.println("Enrollment_Number: "+s2.enroll_no);
		System.out.println("Name: "+s2.name);
		System.out.println("Semester: "+s2.sem);
		System.out.println("-----------------------------");
		
		System.out.println("Enrollment_Number: "+s3.enroll_no);
		System.out.println("Name: "+s3.name);
		System.out.println("Semester: "+s3.sem);
		System.out.println("-----------------------------");
	}
}