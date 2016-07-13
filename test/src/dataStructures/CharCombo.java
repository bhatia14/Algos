package dataStructures;

import java.util.ArrayList;

public class CharCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1123;
		ArrayList arrayList=new ArrayList<>();
		while(a>0){
			arrayList.add(a%10);
			a=a/10;
		}
		int i=0;
		ArrayList<String> ar=new ArrayList<>();
		while(i<arrayList.size()){
			int x=(int)arrayList.get(i);
			if(i!=arrayList.size()){
				x=x+ ((int)arrayList.get(i+1)*10);
				if(x<27){
					//ar.add(e);
					i++;
				}
			}
		}
		System.out.println();
	}

}
