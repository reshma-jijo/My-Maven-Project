package multilevelinheritance;

public class HraCalc extends ToGetSalaryDetails{
	
	double hra=0,pf=0;

	public void calcHra()
	{
		hra=(basepay/100)*5;
		pf=(basepay/100)*20;
		
	}
}
