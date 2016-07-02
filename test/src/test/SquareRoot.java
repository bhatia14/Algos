package test;

public class SquareRoot {
/*
 * Algorithm:
1) Start with 'start' = 0, end = 'x',
2) Do following while 'start' is smaller than or equal to 'end'.
      a) Compute 'mid' as (start + end)/2
      b) compare mid*mid with x.
      c) If x is equal to mid*mid, return mid.
      d) If x is greater, do binary search between mid+1 and end. In this case, we also update ans (Note that we need floor).
      e) If x is smaller, do binary search between start and mid-1
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=0, x=25, end=x, ans=0;
		int mid=0;
		while(start<=end){
			mid=(start+end)/2;
			if(x==(mid*mid)){
				System.out.println(mid);
				break;
			}
			else if(x>(mid*mid)){
				start=mid+1;
				ans=mid;
			}
			else if(x<(mid*mid)){
				end=mid-1;
				ans=mid;
			}
		}
		System.out.println(ans);
	}

}
