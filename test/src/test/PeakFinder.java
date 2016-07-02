package test;

public class PeakFinder {

	public static void main(String[] args) {
		int ar[]={1, 3, 20, 4, 1, 0};
		PeakFinder peakFinder=new PeakFinder();
		peakFinder.peekFinder(ar, 0, ar.length);

	}
	public void peekFinder(int ar[], int low, int n){
		
		int mid=(n-low)/2;
		if((mid==0 || (ar[mid]>=ar[mid-1])) && 
				(mid==n || ar[mid]>=ar[mid+1])){
			System.out.println(ar[mid]);
		}
		/*else if(mid==0 || (ar[mid]<=ar[mid-1])){
			peekFinder(ar, mid+1, n);
		}*/
		else{
			peekFinder(ar, mid+1, n);
		}
		
		
	}

}
