package test;

public class CountNegativeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][] ={ {-3, -2, -1,  -1},
	             {-2,  -2,  -3,  4},
	             {-4,   -5,  7,  8}
				};
		int numRow=ar.length;
		int numCol=ar[0].length;
		int count=0;
		int x=0;
		//int z=
		while(x<numRow){
			for(int i=numCol-1;i>=0;i--){
				if(ar[x][i]<0){
					count+=i+1;
					numCol=i+1;
					break;
				}
			}
			x++;
		}
		System.out.println(count);
	}

}
