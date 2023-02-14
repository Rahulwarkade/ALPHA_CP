public class OppsQs
{
	public static void main(String args[])
	{
		Complex ob1 = new Complex();
		Complex ob2 = new Complex();
		Complex ob3 = new Complex();
		ob1.num1 = 24;
		ob1.num2 = 3;
		ob2.num1 = 23;
		ob2.num2 = 3;
		ob3.sum(ob1,ob2);
		ob3.product(ob1,ob2);
		ob3.diff(ob1,ob2);
	}
}

class Complex
{
	int num1;
	int num2;

	void sum(Complex ob1, Complex ob2)
	{
		System.out.println((ob1.num1+ob2.num1)+" + i"+(ob1.num2+ob2.num2));
	}
	void product(Complex ob1,Complex ob2)
	{
		System.out.println((ob1.num1*ob2.num1)+" + i"+(ob1.num2*ob2.num2));
	}
	void diff(Complex ob1,Complex ob2)
	{
		System.out.println((ob1.num1-ob2.num1)+" + i"+(ob1.num2-ob2.num2));
	}
}