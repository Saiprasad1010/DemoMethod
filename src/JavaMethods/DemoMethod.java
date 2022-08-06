package JavaMethods;

public class DemoMethod {
	
	static int Percentage=859;
	float b=59.32f;
	char x='g';
	static double n=26.54;
	
	void method() {
		int a=35,b=95,c=a*b;
		System.out.println(c);
	}
	static void abc() {
		int a=35,b=65,c=a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoMethod v=new DemoMethod ();
		System.out.println(v.b);
		System.out.println(v.x);
		v.method();
		abc();
		System.out.println(n);
		System.out.println(Percentage);
		
		
		
		
	}

}
