package Exceptionhandling;

public class Arrayoutofbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[2];
		try {
			a[0]=10;
			a[1]=20;
			a[3]=30;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		

	}

}
