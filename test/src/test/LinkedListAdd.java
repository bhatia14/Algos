package test;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListAdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int val1=64957;
		int val2=48;
		LinkedList<Integer> linkedList1=new LinkedList<>();
		LinkedList<Integer> linkedList2=new LinkedList<>();
		LinkedList<Integer> linkedList3=new LinkedList<>();
		linkedList1=addInList(val1, linkedList1);
		linkedList2=addInList(val2, linkedList2);
		int temp=0, d=0, carry=0;
		if(linkedList1.size()>linkedList2.size()){
			for(int i=0;i< linkedList1.size();i++){
		//		if(linkedList1.get(i)!=null && linkedList2.get(i)!=null){
					temp=(linkedList1.get(i)!=null?linkedList1.get(i):0)+(linkedList2.get(i)!=null?linkedList2.get(i):0)+carry;
					carry=0;
					if(temp>9){
						d=temp%10;
						carry=temp/10;
						linkedList3.add(d);
					}
					else
						linkedList3.add(temp);
				}
			//}
		}
		else{
			for(int i=0;i< linkedList2.size();i++){
				//if(linkedList1.get(i)!=null && linkedList2.get(i)!=null){
					temp=(linkedList1.get(i)!=null?linkedList1.get(i):0)+(linkedList2.get(i)!=null?linkedList2.get(i):0)+carry;
					carry=0;
					if(temp>9){
						d=temp%10;
						carry=temp/10;
						linkedList3.add(d);
					}
					else
						linkedList3.add(temp);
				}
			//}
		}
		for(int i=linkedList3.size()-1;i>=0;i--)
			System.out.print(linkedList3.get(i));
		
	}
	static LinkedList addInList(int val, LinkedList<Integer> linkedList){
		//int x=val;
		int d=0;
		linkedList=new LinkedList<Integer>();
		while(val>0){
			d=val%10;
			val=val/10;
			linkedList.add(d);
		}
		return linkedList;
	}

}
