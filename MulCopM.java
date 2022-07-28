class MulCopM{
	int x=10;
	int y=20;
	public static void main(String[] args){
	MulCopM e1 = new MulCopM();
	MulCopM e2 = new MulCopM();

	System.out.println(e1.x);
	System.out.println(e1.y);
	
	System.out.println(e2.x);
	System.out.println(e2.y);

	e1.x=15;
	e1.y=16;
	System.out.println(e1.x+" "+e1.y);
	System.out.println(e2.y+" "+e2.y);
	}
}
