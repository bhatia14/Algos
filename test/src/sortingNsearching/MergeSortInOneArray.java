package sortingNsearching;

public class MergeSortInOneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]={2,4,10,14,17,33};
		int a[]=new int[2*b.length];
		int c[]={1,3,6,7,11,34};
		for(int i=0;i<c.length;i++)
			a[i]=c[i];
		//a=new int[2*b.length];
		//int b[]={2,4,10,14,17,33};
		int i=c.length-1;
		int j=b.length-1;
		int k=a.length-1;
		
		while(i>=0 && j>=0){
			if(a[i]>b[j]){
				a[k--]=a[i--];
			}
			else
				a[k--]=b[j--];
		}
		while(j>=0){
			a[k--]=b[j--];
		}
		for(int l=0;l<a.length;l++)
			System.out.print(a[l]+" ");
	}

}
