package multilevelinheritance;

public class TotalSalary extends HraCalc {
	
	public void totalSalaryCalc()
	{
		double total=(basepay+hra+bonus-pf-ded);
		System.out.println("HRA is "+hra);
		System.out.println("PF is "+pf);
		System.out.println("Total salary is "+total);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalSalary obj=new TotalSalary();
		obj.getsalaryinfo(50000,5000,6000);
		obj.calcHra();
		obj.totalSalaryCalc();
		

	}

}
