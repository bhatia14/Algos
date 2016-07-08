package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=1, k=1, x=0;
		System.out.print(j+" "+k);
		for(int i=3;i<=10;i++){
			x=j+k;
			j=k;
			k=x;
			System.out.print(" "+x);
		}
	}
	public static int fibonacci(int i){
		System.out.println(i);
		i+=i;
		//fibonacci(i);
		return i;
	}

}
