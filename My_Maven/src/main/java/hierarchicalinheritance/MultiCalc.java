package hierarchicalinheritance;

public class MultiCalc extends AdditionCalc{
	
	public void multi()
	{
		int c=a*b;
		System.out.println("Value is "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiCalc obj2=new MultiCalc();
		obj2.addition();
		obj2.multi();
		

	}
	
	

}
