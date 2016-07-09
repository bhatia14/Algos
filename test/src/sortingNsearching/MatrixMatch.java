package sortingNsearching;

public class MatrixMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][]={	{1, 10, 14, 19, 25},
						{5, 16, 35, 45, 68},
						{15, 45, 95, 112, 175}
			};
		int elm=112;
		int row=0;
		int col=ar[0].length-1;
		while(row<ar.length && col>=0){
			if(ar[row][col]==elm){
				System.out.println(row+" "+col);
				break;
			}
			else if(ar[row][col]<elm){
				row++;
			}
			else
				col--;
		}
		
		
	}
	

}
