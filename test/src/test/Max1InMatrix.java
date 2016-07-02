package test;

public class Max1InMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][]={ {0, 1, 1, 1},
		        {0, 1, 1, 1},
		        {1, 1, 1, 1},
		        {0, 0, 0, 0}
		    };
		
		int total=0;
		int row=-1;
		//System.out.println(ar[].length);
		for(int i=0;i<ar.length;i++){
			int sum=0;
			for(int j=0;j<ar[0].length;j++)
				sum+=ar[i][j];
			
			if(total<sum){
				total=sum;
				row=i;
			}
		}
		System.out.println(row+1);
	}
	
}
