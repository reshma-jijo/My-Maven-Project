package inheritance;

public class ClassChild extends ClassParent {
	
	
	public void sub()
	{
		int c=b-a;
		System.out.println("Substracted value is "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassChild obj=new ClassChild();
		obj.add();
		obj.sub();

	}

}
