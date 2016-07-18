package dataStructures;

import java.util.HashMap;

public class FirstEvenNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= { 4, 5, 6, 7, 8, 9, 5, 5, 3, 4, 12, 5 ,4, 5,12};
		HashMap<Integer,Boolean> hashMap=new HashMap<>();
		for(int a:ar){
			if(hashMap.get(a)==null){
				hashMap.put(a, false);
			}
			else{
				boolean x=hashMap.get(a);
				if(x)
					hashMap.put(a, false);
				else
					hashMap.put(a, true);
			}
		}
		for(int a:ar){
			if(hashMap.get(a)){
				System.out.println(a);
				break;
			}
				
		}
			
	}

}
