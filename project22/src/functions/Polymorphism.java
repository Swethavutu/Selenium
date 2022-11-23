package functions;

public class Polymorphism {
	public void add()
	{
		System.out.println("null parameters");
		
	}
    public void add(int a,int b)
    {
    	int c=a+b;
    	System.out.println(c);
    	
    }
    public void add(double a,double b) 
    {
    	double d=a+b;
    	System.out.println(d);
    }
    public void add(String a,String b)
    {
    	System.out.println(a+b); 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism p=new Polymorphism();
		p.add();
		p.add(2,3);
		p.add(2.0,79.0);
		p.add("swe","tha");
       
	}

}
