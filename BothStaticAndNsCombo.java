class Example{
		static int a=20;
		static int b=30;

		int x=40;
		int y=40;

		static void m1(){
		System.out.println("M1 is Executed");
		}

		void m2(){
		System.out.println("M2 is Executed");
		}
	

		public static void main(String[] args){
		System.out.println("Main Started");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		m1();
		
		Example e1=new Example();
		System.out.println("E1.x is "+e1.x);
		System.out.println("E1.y is "+e1.y);
		e1.m2();
		
		Example e2=new Example();

		System.out.println("e2.x :"+e2.x);
		System.out.println("e2.y :"+e2.y);
		e2.m2();		
		}
}
