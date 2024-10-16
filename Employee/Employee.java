import java.util.Scanner;

public class Employee{
	private double salary;
	private double gross;
	private double pf;
	private double annualGross;
	private double tax;
	private double monthlyTax;
	private double sal;
	public double setEmployeesalary(double basic,double boa,int experienceLevel )
	{	
	        if(experienceLevel==1)
	        {
	       	salary=basic+boa+2000;
	       	pf=basic*0.12;
	       	gross=salary-pf;
	        }
	        else if(experienceLevel==2)
	        {
	        	salary=basic+boa+2500;
		       	pf=basic*0.12;
		       	gross=salary-pf;
	        }
	        else if(experienceLevel==3)
	        {
	        	salary=basic+boa+3000;
		       	pf=basic*0.12;
		       	gross=salary-pf;
	        }
	        else if (experienceLevel==4)
	        {
	        	salary=basic+boa+3500;
		       	pf=basic*0.12;
		       	gross=salary-pf;
	        }
	        else
	        {
	         System.out.println("Invalid data");
	        }
	        annualGross=gross*12;   
	        return annualGross;
	}
	public double takeHomeSalary(double annualGross)
	{
		if(annualGross<250000)
		{
			tax=annualGross;
		}
		else if(annualGross>=250000 && annualGross<500000)
		{
			tax=annualGross*0.05;
		}
		else if(annualGross>=500000 && annualGross<750000)
		{
			tax=annualGross*0.10;
		}
		else if(annualGross>=750000 && annualGross<1000000)
		{
			tax=annualGross*0.15;
		}
		else if(annualGross>=1000000 && annualGross<1250000)
		{
			tax=annualGross*0.20;
		}
		else if(annualGross>=1250000 && annualGross<1500000)
		{
			tax=annualGross*0.25;
		}
		else
		{
			tax=annualGross*0.30;
		}
		monthlyTax=tax/12;
		sal=gross-monthlyTax;
		return sal;
	}
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("Enter the Employee Basic Pay:");
		double basic=obj.nextDouble();
		System.out.println("Enter the Employee BOA:");
		double boa=obj.nextDouble();
		System.out.println("Enter the Employee level of Experience:");
		short experienceLevel=obj.nextShort();
		double gsalary=e.setEmployeesalary(basic, boa, experienceLevel);
	    double takehome=e.takeHomeSalary(gsalary);
		System.out.println("Employee TakeHome Salary is:" + takehome);
		obj.close();
		
	}
	

}
