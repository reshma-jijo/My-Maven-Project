package hierarchicalinheritance;

public class SubstractionCalc extends AdditionCalc{
	
	public void substract()
	{
		int c=b-a;
		System.out.println("Value is "+c);
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubstractionCalc obj1=new SubstractionCalc();
		obj1.addition();
		obj1.substract();
	}

}
