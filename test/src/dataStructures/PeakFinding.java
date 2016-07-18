package dataStructures;

public class PeakFinding {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,18,21,24};
		PeakFinding peakFinding=new PeakFinding();
		System.out.println(peakFinding.peak1D(arr, 0, arr.length-1));
		
	}
	public int peak1D(int[] arr, int start, int end){
        //edge cases
      if (end-start==1){
          if (start==0)
              return start;
          else 
           return end;
      }
      int i = start+end>>>1;
      if (arr[i]<arr[i-1])
         return peak1D(arr,start,i);
      if (arr[i]<arr[i+1]){
          return peak1D(arr, i, end);
      }
      else
          return arr[i];
  }
}
