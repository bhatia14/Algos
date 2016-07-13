package dataStructures;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="masddsam";
		char ar[]=s.toCharArray();
		boolean flag=false;
		for(int i=0;i<ar.length/2;i++){
			if(ar[i]==ar[ar.length-1-i]){
				flag=true;
			}
			else{
				flag=false;
				break;
			}
		}
		System.out.println(flag);
	}

}
