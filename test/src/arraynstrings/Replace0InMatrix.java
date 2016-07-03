package arraynstrings;

public class Replace0InMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][]={{1,2,3},
					{3,0,5},
					{0,5,7}};
		int row[]=new int[ar.length];
		int col[]=new int[ar[0].length];
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar[0].length;j++){
				if(ar[i][j]==0){
					row[i]=1;
					col[j]=1;
				}
			}
		}
		for(int i=0;i<row.length;i++){
			for(int j=0;j<col.length;j++){
				if(row[i]==1 || col[i]==1){
					ar[i][j]=0;
				}
			}
		}
		System.out.println(ar);
		
		
		
	}
	
	

}
