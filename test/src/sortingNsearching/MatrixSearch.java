package sortingNsearching;

public class MatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][]={	{1,10,14},
						{5,16,35},
						{15,45,95}
					};
		int i=0;
		for( i=0;i<ar.length;i++){
			if(ar[0][i]>16){
				i--;
				break;
			}
		}
		int j=0;
		int x=1;
		while(x==1){
			for(j=0;j<ar[0].length;j++){
				if(ar[i][j]==16){
					System.out.println(ar[i][j]);
				}
				else if(ar[i][j]>16){
					j--;
					i++;
				}
			}
		}
		
		
		/*int i=ar.length-1;
		int j=ar[0].length-1;
		int start=0;
		while(ar[i][j]!=45){
			int midRow=(start+i)/2;
			int midCol=(start+j)/2;
			if(ar[midRow][start]==45){
				System.out.println(start+" "+midRow);
				break;
			}else if(ar[midRow][start]>45){
				start=0;
				i=midRow;
			}
			else{
				start=midRow;
				
			}
			if(ar[start][midCol]==45){
				System.out.println(start+" "+midCol);
				break;
			}else if(ar[start][midCol]>45){
				start=0;
				j=midCol;
			}
			else{
				start=midCol;
				
			}
			
			
		}
*/
	}


}
