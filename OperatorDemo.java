
public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(10+20);
		System.out.println(10+"20");
		System.out.println("10"+"20");
		System.out.println("10"+20);
		
		increment_Ops();
		Relational_Ops();
		Logical_Ops();
		
	}	
		
	
	public static void increment_Ops()
		{
			//pre-increment
		
		int a=5;
		System.out.println(++a);
		
		int b=7;
		System.out.println(b++);
		
		int c=b;
		System.out.println(c);
		
		}

	public static void Relational_Ops() {
		
		int a=10,b=15;
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a<=b);
		System.out.println(a>=b);
	}
	
	public static void Logical_Ops() {
		
		System.out.println(true && true);
		System.out.println(true || true);
		System.out.println(false && false);
		System.out.println(false || false);
		System.out.println(true && false);
		System.out.println(true || false);
		
	}

}
