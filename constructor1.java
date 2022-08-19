package constructor;

public class constructor1 {
	int x=3,y=9;
	
	constructor1()                                  //default constructor
	{
		System.out.println("this is default constructor");
		int z=x+y;
		System.out.println("the addition is " +z);
	}
	
	constructor1(int p,int q)					//parametrized constructor
	{
		int k=p+q;
		System.out.println("the addition is " +k);
		
	}
	
	public static void main(String[] args) {
		constructor1 c=new constructor1();
		constructor1 c2=new constructor1(40, 90);
		
	}

}
