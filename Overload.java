class Overload{
	static void add(int a, int b){
		int c = a+b;
		System.out.println("add is:"+c);
	}

	static void add(int a, int b, int c){
                int d = a+b+c;
                System.out.println("add is:"+d);
        }
	
	static void sub(int a, double d){
		double res=a-d;
		System.out.println("Sub(i,d):"+res);
	}

	public static void main(String[] args){
		System.out.println("Main Start");

		//add(); CE: no suitable method found for add(no-argument)
		//add(5); CE: no suitable method found for add(int)
		add(5,6);
		add(5,6,7);
		//add(5,6,7,8);no sutiable method found for add(int,int,int,int)
		//sub();CE: no suitable Method found for sub(int)
		sub(5,6.7);
		//sub(6.7,5);no suitable method found for sub(double,int)
		System.out.println("Main End");
	}
}
