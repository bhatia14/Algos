package test;

public class ZeroMoveToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]={1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		int count=0;
		//System.out.println(ar);
		for(int i=0;i<ar.length;i++){
			//System.out.print("old"+ar[i]);
			if(ar[i]!=0)
				ar[count++]=ar[i];
			//System.out.print("new"+ar[i]);
		}
		 while (count < ar.length)
	            ar[count++] = 0;
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]);
		}
		
	}

}
