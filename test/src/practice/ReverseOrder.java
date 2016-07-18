package practice;

import java.util.LinkedHashSet;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="aaafffcccddaabbeeddhhaaabbccddaaaa";
		LinkedHashSet hashSet=new LinkedHashSet();
		char ar[]=a.toCharArray();
		for(int i=ar.length-1;i>0;i--)
			hashSet.add(ar[i]);
		System.out.println(hashSet);

	}

}
