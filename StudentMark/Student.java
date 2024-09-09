import java.util.Scanner;
public class Student {

	public int r,r1;
	
	public int total(int m1,int m2,int m3,int m4)
	{
		r=m1+m2+m3+m4;
		return r;
	}
	public int average(int r)
	{
		r1=r/4;
		return r1;
	}
	
public static void main(String[] args) {
		
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter the total number of students:");
			int i=obj.nextInt();
			for (int j=1;j<=i;j++)
			{
				System.out.println("Enter 4 subject marks for student " + j);
				int m1= obj.nextInt();
				int m2= obj.nextInt();
				int m3= obj.nextInt();
				int m4= obj.nextInt();
				Student s = new Student();
				int result=s.total(m1,m2,m3,m4);
				int result1=s.average(result);
				System.out.println("Student total mark is:" + result);
				System.out.println("Student average is:" + result1);
			}
			obj.close();
	}	
}
