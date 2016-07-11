package recursion;

public class TryStringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello";
		permuation(a,"");
	}
	private static void permuation(String str, String prefix){
		int n=str.length();
		if(n==0){
			System.out.println(prefix);
		}
		else{
			for(int i=0;i<n;i++){
				permuation(str.substring(0,i)+str.substring(i+1,n),prefix+str.charAt(i));
			}
		}
	}

}
