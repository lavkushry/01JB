class VarObj{
	static int a=10;
	static int b=20;

	static void  m1(){
		System.out.println("M1");
	}
	
	static void m2(int m){
		System.out.println("M2");
	}
	
	static void m3(String s){
		System.out.println("M3");
	}
	public static void main(String[] args){
		System.out.println("Main start");
		System.out.println("A is"+a);
		System.out.println("B is "+b);
		m1();
		m2(15);
		m3("Lav");
		System.out.println("Main method end");
	}
}
