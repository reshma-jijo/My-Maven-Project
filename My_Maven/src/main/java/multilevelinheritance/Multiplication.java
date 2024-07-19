package multilevelinheritance;

public class Multiplication extends Substraction{
 public void multiCalc()
 {
	 int c=a*b;
	 System.out.println("Value is "+c);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multiplication obj=new Multiplication();
		obj.additionCalc();
		obj.substractionCalc();
		obj.multiCalc();
	}

}
