package Array;

public class Singledimenssionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30};
	       String b[]={"testing tools","hello"};
	       String c[][]={{"c","d"},{"a","b"}};
	       for(int i=0;i<a.length;i++)
	       {
	    	   System.out.println(a[i]+" ");
	       }
	       for(int i=0;i<b.length;i++)
	       {
	    	   System.out.println(b[i]+" ");
	       }
	       for(int k=0;k<c.length;k++)
	       {
	    	   for(int j=0;j<c[k].length;j++)
	    	   {
	    		   System.out.println(c[k][j]+" ");
	    	   }
	    	   System.out.println();
	       }
		}

	}


