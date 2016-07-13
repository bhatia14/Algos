package dataStructures;

public class ShiftingMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][]={{1, 2, 3, 2},
				{4, 5, 6, 4},
				{7, 8, 9, 0},
				{9, 3, 5, 1}};
		int temp=0, temp2=0;
		//for(int i=0;i<ar.length;i++){
		int i=0;
			temp=ar[i][0];
			int j;
			for( j=1;j<ar[0].length;j++){
				temp2=ar[i][j];
				ar[i][j]=temp;
				temp=temp2;
			}
			//int j=1;
			j--;
			for(i=1;i<ar.length;i++){
				temp2=ar[i][j];
				ar[i][j]=temp;
				temp=temp2;
			}
	//	}
			i--;
			for( j=ar[0].length-2;j>=0;j--){
				temp2=ar[i][j];
				ar[i][j]=temp;
				temp=temp2;
			}
			j++;
			for(i=ar.length-2;i>=0;i--){
				temp2=ar[i][j];
				ar[i][j]=temp;
				temp=temp2;
			}
			
			
			//temp=ar[i][0];
			
		
		
		
		for(i=0;i<ar.length;i++){
			
			
			for(j=0;j<ar[0].length;j++){
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}
		
	}

}
