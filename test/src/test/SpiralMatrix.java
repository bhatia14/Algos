package test;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { {1,  2,  3,  4,  5,  6},
		        {7,  8,  9,  10, 11, 12},
		        {13, 14, 15, 16, 17, 18}
		    };
		
		int row=a.length;
		int col=a[0].length;
		int srow=0;
		int scol=0;
		int i=0,j=0;
		while(row>srow && col>scol){
			for( i=0;i<col;i++){
				System.out.print(a[0][i]+" ");
			}
			for( j=1;j<row;j++){
				System.out.print(a[j][i-1]+" ");
			}
			for(i=i-2;i>=0;i--){
				System.out.print(a[j-1][i]+" ");
			}
			for( j=j-2;j>0;j--){
				System.out.print(a[j][i+1]+" ");
			}
			break;
		}
		
	}

}
