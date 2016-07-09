package sortingNsearching;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,3,6,7,11,34};
		int b[]={2,4,10,14,17,33};
		int ar[]=new int[2*a.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length){
			if(j<b.length){
				if(a[i]>b[j]){
					ar[k]=b[j];
					j++;
				}
				else if( a[i]<=b[j]){
					ar[k]=a[i];
					i++;
				}
			}
			else{
				ar[k]=a[i];
				i++;
			}
				k++;
		}
		if(ar[ar.length-1]==0)
			ar[ar.length-1]=b[b.length-1];
		
		
		for(i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
	}

}
