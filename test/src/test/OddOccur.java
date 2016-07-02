package test;

public class OddOccur {
	static int getOddOccurrence(int ar[], int ar_size)
	{
	     int i;
	     int res = 0; 
	     for (i=0; i < ar_size; i++){     
	        res = res ^ ar[i];
	        System.err.println(res);
	     }
	     return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
	     int n = ar.length;
	     System.out.println( getOddOccurrence(ar, n));
	}

}
