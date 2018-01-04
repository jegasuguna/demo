package runner;

public class Arithmetic {
	int a,b,c,d,e;
	
	public Arithmetic(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Arithmetic(int c, int d,int e) {
		super();
		this.c = c;
		this.d = d;
		this.e = e;
	}
	public int subt()
	{
	return(a-b);
}
	
	
	public int add()
	{
		return(c+d+e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic sum= new Arithmetic(24,96);
		Arithmetic diff= new Arithmetic(58,11,66);
		System.out.println("Addition:" + diff.add());
		System.out.println("Subtraction:" + sum.subt());
		//yhdujhd
	
	}

}

