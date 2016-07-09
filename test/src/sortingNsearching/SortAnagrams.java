package sortingNsearching;

import java.util.ArrayList;
import java.util.HashMap;

public class SortAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, ArrayList<String>> strings=new HashMap<>();
		String ar[]={"god", "dog", "abc", "cab", "man", "nam"};
		int val[]=new int[ar.length];
		for(int i=0;i<val.length;i++){
			for(int j=0;j<ar[i].length();j++){
				val[i]+=ar[i].charAt(j);
			}
		}
		for(int i=0;i<val.length;i++){
			ArrayList<String> value=new ArrayList<>();
			for(int j=i;j<val.length;j++){
				if(val[i]==val[j] && val[j]!=0){
					value.add(ar[j]);
					val[j]=0;
				}
			}
			strings.put(val[i], value);
		}
		System.out.println(strings);
	}

}
