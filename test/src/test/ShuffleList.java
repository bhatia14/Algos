package test;

import java.util.Random;

public class ShuffleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]={1,2,3,4,5,6,7,8,9};
		Random r=new Random();
		int i=1;
		int size=ar.length;
		while(i<ar.length){
			int rand=r.nextInt(size);
			int temp=ar[i];
			ar[i]=ar[rand];
			ar[rand]=temp;
			i++;
			size--;
		}
		for(i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
		
		
	}

}
