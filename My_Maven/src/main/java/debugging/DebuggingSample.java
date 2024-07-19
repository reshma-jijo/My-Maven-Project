package debugging;

public class DebuggingSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DebuggingSample obj=new DebuggingSample();
		obj.printNumbers();
	
	}
		
		public void printNumbers()
		{
			this.DebuggingSample(10,20);
			for(int i=0;i<=10;i++)
			{
				System.out.println(i);
			}
		
	}
		
		public void DebuggingSample(int a, int b)
		
		{
	   
	    int c=a+b;
	    System.out.println("Sum is "+c);
			
		}
		
}
