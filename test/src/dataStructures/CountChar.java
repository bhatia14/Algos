package dataStructures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abbaccdbac";
		char ar[]=a.toCharArray();
		HashMap<Character, Integer> hashMap=new HashMap<>();
		for(int i=0;i<ar.length;i++){
			if(hashMap.containsKey(ar[i])){
				int x=hashMap.get(ar[i]);
				hashMap.put(ar[i], ++x);
			}
			else
				hashMap.put(ar[i], 1);
		}
		
		Iterator itr=hashMap.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.print(entry.getKey()+""+entry.getValue());
		}
	}

}
