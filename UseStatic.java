
public class UseStatic {
	

	static int a=2;
	static int b;
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				method1(5);
                System.out.println("Value of b="+b);
	}
	static void method1(int x)
	{
		System.out.println("Value of x:"+x);
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
		
	}

	static
	{
		b=a*2;
	}
}
