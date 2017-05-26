package demo;

public class Arithmetic {
	int a=10;
	int b=20;
	int c;
	
	public void add()
	{
		c=a+b;
		System.out.println("addition"+c);
	}
	public void mul()
	{
		c=a*b;
		System.out.println("multiplication "+c);
	}
public static void main(String[] args) {
		Arithmetic a=new Arithmetic();
		a.add();
		a.mul();

	}

}
