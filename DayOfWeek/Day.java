import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Day of the week");
		int n=obj.nextInt();
		switch(n)
		{
		 case 1: System.out.println("Sunday");
		 break;
		 case 2: System.out.println("Monday");
		 break;
		 case 3: System.out.println("Tuesday");
		 break;
		 case 4: System.out.println("Wednesday");
		 break;
		 case 5: System.out.println("Thursday");
		 break;
		 case 6: System.out.println("Friday");
		 break;
		 case 7: System.out.println("Saturday");
		 break;
		 default:
			 System.out.println("Number entered is out of range.Please enter between 1-7");
		}
		obj.close();

	}

}
